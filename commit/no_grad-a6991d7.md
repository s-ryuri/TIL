# no\_grad@a6991d7

[Permalink](no_grad-a6991d7.md)

 Showing with **15 additions** and **0 deletions**.

1.  +15 −0 [Pytorch/with torch.no\_grad.md](no_grad-a6991d7.md#diff-cd85372b22f4752c1041e0db283af4f2acc575a839565162c33eb2d4f89563aa)

|  |  | @@ -0,0 +1,15 @@ |
| :--- | :--- | :--- |
|  |  |  \# torch.no\_grad |
|  |  |  |
|  |  |  !\[image\]\(https://user-images.githubusercontent.com/66999675/130948644-aa442c7b-1a9f-4011-8517-dca31ccc8aa0.png\) |
|  |  |  |
|  |  |  출처 : https://pytorch.org/docs/stable/generated/torch.no\_grad.html?highlight=torch%20no\_grad\#torch.no\_grad |
|  |  |  |
|  |  |  이름 그대로 torch.no\_grad\(\) |
|  |  |  |
|  |  |  gradient 연산을 그만할 때 사용하는 함수이다. |
|  |  |  |
|  |  |  그전에는 requires\_grad = True로 된 Tensor에 대해 연산을 기록한다. |
|  |  |  |
|  |  |  with torch.no.grad\(\)를 사용하면 이제 requires\_grad = False로 해서 그 Tensor에 연산을 기록하는 걸 그만한다. |
|  |  |  즉 autograd 엔진을 꺼버린다. autograd 엔진을 껐기에 Backpropagation에 필요한 메모리 등을 절약할 수 있기에 with torch.no\_grad\(\)가 적용된 Tensor를 사용하면 계산 시 연산 속도가 빨라진다. |
|  |  |  하지만 backpropagation을 할 수 없기에 학습은 불가능하다. |

