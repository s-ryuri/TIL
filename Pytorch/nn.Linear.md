# nn.Linear()
pytorch에서 선형회귀 모델은 nn.Linear() 함수에 구현되어 있다.

![image](https://user-images.githubusercontent.com/66999675/130357535-63c5c828-9c3d-49d4-82c4-b0ff4721fe41.png)

입력되는 x의 차원과 출력되는 y의 차원을 입력해 주면 된다.

단순 선형회귀는 하나의 입력 x에 대해 하나의 입력 y가 나오니

![image](https://user-images.githubusercontent.com/66999675/130357548-0cc5c320-16de-4041-b71c-4da24f853a94.png)  
로 하면 된다.

PyTorch 공식 문서 내용을 보면

![image](https://user-images.githubusercontent.com/66999675/130357554-8715a332-8578-494c-83af-f2f03a0723f3.png)


- Parameter
in_features는 input sample의 size

out_features는 output sample의 size

bias는 만일 False로 설정되어 있으면 layer는 bias를 학습하지 않는다. 기본값은 True이다.

device는 CPU, GPU 중 고르는 거고

dtype은 자료형의 타입을 정하는 것 같다.

- Shape

![image](https://user-images.githubusercontent.com/66999675/130357574-9d89cf3d-4988-4b89-89e3-77f4783c5d12.png)


input에서 *은 어떤 additional dimension을 의미하고 H(in)은 in_features를 의미한다.

Ouput 마지막 차원을 제외한 모든 차원이 입력과 동일한 경우이고 H(out) = Out_features이다.

![image](https://user-images.githubusercontent.com/66999675/130357582-c2b00fe8-64de-4380-89af-d760aa3f8f0d.png)

코드를 보면 이해가 된다.

1. x의 input 사이즈는 20 output size는 30이다.
2. input : (N, * , Hin) 이기에 128 * 20이고 x의 input 사이즈는 20
3. input을 m에 넣으면 output size가 30으로 나오게 된다.
5. torch.Size가 128 * 30으로 된 걸 볼 수 있다.
