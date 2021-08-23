# torch.utils.data

```python
from torch.utils.data import DataLoader
```

모델을 학습하기 위해서는 데이터를 모델에 지속적으로 전달해야 한다.   
데이터를 하나씩 전달하지 않고 원하는 batch size로 묶어서 전달하거나 더 효율적인 학습을 위해   
데이터를 규칙에 따라 정렬하거나 섞어야 할 때 사용하는 모듈이 DataLoader이다.

![image](https://user-images.githubusercontent.com/66999675/130412554-f7e8efaf-4c04-4c32-b66e-8936320beb32.png)
- 출처 : https://pytorch.org/docs/stable/data.html?highlight=torch%20utils%20data#module-torch.utils.data
```python
torch.utils.data.DataLoader()
```
형태로 쓴다.

#### 매개변수

![image](https://user-images.githubusercontent.com/66999675/130412619-5feee03d-bc74-4d5b-80ce-4da00da44b45.png)
![image](https://user-images.githubusercontent.com/66999675/130412628-d1844835-b5c9-47f3-9e56-236b42ecacd6.png)

매개변수가 굉장히 많은데 중요한 것만 보면
```python
train_loader = torch.utils.data.DataLoader(mnist_train,batch_size = batch_size,
                                           shuffle = True,num_workers = 2,drop_last = True)
test_loader = torch.utils.data.DataLoader(mnist_test,batch_size = batch_size,
                                           shuffle = True,num_workers = 2,drop_last = True)
```
- data : 다룰 데이터를 넣어주면 된다.

- batch_size : 데이터를 batch_size 개수만큼 묶는다는 의미이다.

- shuffle : 데이터를 매 epoch에서 다시 섞을지를 결정한다. default = False이다.

- num_workers : 데이터를 묶을 때 사용할 프로세스의 수

- drop_last : 데이터세트 크기가 배치 크기로 나눌 수 없는 경우에 나누고 난 뒤 마지막 배치를 삭제할지를 결정한다.  
예를 들어 데이터 세트 크기가 5이고 배치 사이즈가 2이면 2,2,1로 나눠지는데  
이때 1은 배치 사이즈보다 작으니까 버릴 건지를 결정하는 거다.

# torchvision

```python
import torchvision.datasets as dset
import torchvision.transforms as transforms
```
- torchvision은 영상처리용 데이터 셋, 모델, 이미지 변환기가 들어 있는 패키지로 dataset 모듈은 데이터를 읽어오고   
- transforms는 불러온 이미지를 필요에 따라 변환해 주는 역할을 한다.

```python
mnist_train = dset.MNIST('./',train = True,transform = transforms.ToTensor(),
                         target_transform = None,download = True)
mnist_test = dset.MNIST('./',train = False,transform = transforms.ToTensor(),
                        target_transform = None,download = True)
```

deep_learning의 hello world와 같은 MNIST 데이터를 다운로드하는 코드이다.

dest.MNIST를 이용한다. 


- 첫 번째 인수는 데이터의 경로이다. 현재 코드가 있는 위치를 경로로 사용하겠다는 의미이다. 

-  train = True 이면 학습 데이터 False면 테스트 데이터를 불러온다.

- transform 데이터의 변형, 즉 이미지에 대한 변형이다. transforms.ToTensor()는 이미지 데이터를 PyTorch Tensor로 변환한다. target_transform은 label에 대한 변형을 의미한다.

- download는 현재 경로에 MNIST 데이터가 없을 경우에 다운로드하겠다는 의미이다.
