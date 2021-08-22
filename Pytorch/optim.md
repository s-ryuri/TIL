# torch.optim

```python
import torch.optim as optim
```
torch.optim은 다양한 최적화 알고리즘을 구현하는 패키지이다.

optimizer는 최적화 함수라고도 하고 경사하강법을 적용해서 오차를 줄이고 최적의 가중치와 편차를 근사하게 하는 역할을 한다.

그중 가장 기본적인 것이 Stochastic gradient descent, SGD이다.
SGD는 한 번에 들어오는 데이터의 수대로 경사하강법 알고리즘을 적용하는 최적화 함수이다.
```python
torch.optim.SGD(params,lr,momentum,dampening = 0,weight_decay = 0, nesterov = False
```
### Parameter


- params : 파라미터 그룹을 정의하거나 최적화하기 위한 파라미터의 반복 기능, 즉 모델의 파라미터를 넣어주면 된다.

- Ir : learning rate의 약자이다.

- momentum : 기본 값이 0인 momentum factor이다.

- weight_decay :  가중치 감소로 기본 값이 0이다.

- dampening : momentum을 위한 dampening이다. 기본 값 0

- nesterov : Nesterov momentum을 사용할지 말 지를 결정한다. 기본 값 0 
* * *
```python
import torch.optim as optim

optimizer = optim.SGD(model.parameters(), lr=0.1, momentum=0.9)
optimizer.zero_grad()
loss = loss_fn(model(input), target)
loss.backward()
optimizer.step()
```


optimizer.zero_grad()는 반복 시에 전에 계산했던 기울기를 0으로 초기화하는 함수이다.

즉 최적화된 모든 torch의 기울기를 0으로 바꾼다.

기울기를 초기화해야 새로운 가중치와 편차에 대해서 새로운 기울기를 구할 수 있기 때문이다.


loss_fn 함수는 model에 input 값을 넣어서 나온 output 값과 target을 비교해서 오차를 구해주는 함수이다.

loss.backward()는 w와 b에 대한 기울기가 계산된다.

optimizer.step()은 model.paramters()에서 리턴되는 변수들의 기울기에 학습률 0.01을 곱해서 빼준 뒤에 업데이트한다.
