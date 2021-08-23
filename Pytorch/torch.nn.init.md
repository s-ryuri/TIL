```python
import torch.nn.init as init
```

# torch.nn.init.uniform_(tensor)

```python
x = init.uniform_(torch.Tensor(10,1),-10,10)
tensor([[-6.2449],
        [ 9.4657],
        [-0.4157],
        [-0.7622],
        [-4.0686],
        [ 1.9439],
        [ 1.9759],
        [-6.4500],
        [-3.3726],
        [ 7.1390]])
```
x 변수에 [10,1] 모양의 tensor을 생성하고 이 텐서의 값들을 init.uniform_() 함수를 통해서 -10부터 10까지 uniform(균등) 하게 초기화한다. 
그럼 -10 ~ 10까지의 숫자들이 무작위로 들어가게 된다.

![image](https://user-images.githubusercontent.com/66999675/130412033-87bb2f5a-d9aa-472a-86df-9a53da01222f.png)

PyTorch 공식 문서를 보면 uniform distribution U(a, b)에서 가져온 값으로 input Tensor를 채운다.

#### 매개변수

- tensor : n 차원의 tensor를 넣어주면 된다.

- a는 균일 분포의 하한

- b는 균일 분포의 상한

# torch.nn.init.normal_(tensor)
![image](https://user-images.githubusercontent.com/66999675/130412131-209fa054-00b1-46d0-aebf-8e800ea3ed99.png)
init.uniform_과 유사하다.

N(mean, std^2)을 따르는 정규 분포에서의 값을 input tensor에 집어넣어 준다.


#### 매개변수

- Tensor : n 차원의 Tensor 크기를 집어넣어 준다. 그럼 그 크기만큼 만들어진다.

 예를 들어 torch.Tensor(3,5)를 집어넣으면 이차원인 3 * 5만큼의 정규 분포의 값이 만들어진다.

- mean : 정규 분포에서의 평균 값

- std : 정규 분포에서의 표준편차

# torch.nn.init.ones_(tensor)

tensor의 크기만큼 1로 채워진 tensor를 만들어준다.
```python
x = init.ones_(torch.Tensor(3,5))
tensor([[1., 1., 1., 1., 1.],
        [1., 1., 1., 1., 1.],
        [1., 1., 1., 1., 1.]])
```

# torch.nn.init.zeros_(tensor)
ones_와 기능은 똑같으나 input tensor를 0으로 채워준다.
```python
x = init.zeros_(torch.Tensor(3,5))
tensor([[0., 0., 0., 0., 0.],
        [0., 0., 0., 0., 0.],
        [0., 0., 0., 0., 0.]])
```

# torch.nn.init.eye_(tensor)

대각 행렬의 값을 1로 채워주고 나머지는 0으로 채워준다.

```python
x = init.eye_(torch.Tensor(3,3))
tensor([[1., 0., 0.],
        [0., 1., 0.],
        [0., 0., 1.]])
```
