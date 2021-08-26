# torch.no_grad

![image](https://user-images.githubusercontent.com/66999675/130948644-aa442c7b-1a9f-4011-8517-dca31ccc8aa0.png)  

출처 : https://pytorch.org/docs/stable/generated/torch.no_grad.html?highlight=torch%20no_grad#torch.no_grad  

이름 그대로 torch.no_grad()

gradient 연산을 그만할 때 사용하는 함수이다.

그전에는 requires_grad = True로 된 Tensor에 대해 연산을 기록한다.

with torch.no.grad()를 사용하면 이제 requires_grad = False로 해서 그 Tensor에 연산을 기록하는 걸 그만한다.   
즉 autograd 엔진을 꺼버린다. autograd 엔진을 껐기에 Backpropagation에 필요한 메모리 등을 절약할 수 있기에 with torch.no_grad()가 적용된 Tensor를 사용하면 계산 시 연산 속도가 빨라진다.   
하지만 backpropagation을 할 수 없기에 학습은 불가능하다.  
