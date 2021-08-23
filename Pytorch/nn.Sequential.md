```python
import torch.nn as nn

model = nn.Sequential(
    nn.Linear(6,10),
    nn.ReLU(10,5),
    nn.Linear(5,4),
    nn.ReLU(4,3),
    nn.Linear(3,1)
)
```
nn.Sequential 클래스는 nn.Linear, nn.ReLU(활성화 함수) 같은 모듈들을 인수로 받아서

순서대로 정렬해놓고 입력값이 들어오면 순서대로 모듈을 실행해서 결과값을 리턴한다.


신경망의 깊이가 깊어질수록 묶어서 연산하는 것이 더 편리하기에 nn.Sequential 클래스를 사용하는 것이 좋다
