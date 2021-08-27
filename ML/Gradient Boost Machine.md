# Gradient Boost Machine(GBM)

GBM은 부스팅 알고리즘이기에 여러 개의 약한 학습기(weak learner)를 순차적으로 학습- 예측하면서 잘못 예측한 데이터 가중치를 부여를 통해 오류를 개선해 나가면서 학습하는 방식이다.

대표적으로 AdaBoost와 Gradient boost가 있다.

AdaBoost의 학습 과정을 그림으로 나타내면 아래와 같다.

![image](https://user-images.githubusercontent.com/66999675/131121273-3ff93864-2760-4bb3-8814-e42aad2e858c.png)  
먼저 feature data set이 있다. 5개의 +와 4개의 -로 이루어져있다.

![image](https://user-images.githubusercontent.com/66999675/131121293-1769007a-e0e4-426b-aac2-32868b5bf7a1.png)  
Step 1이다. 첫 번째 약한 학습기가 분류 기준 1로 +와 -를 분류한다.  
동그라미로 표시된 + 데이터는 + 데이터가 잘못 분류된 오류 데이터이다.

![image](https://user-images.githubusercontent.com/66999675/131121326-05061b82-9e4b-4e55-9572-3f3563acc3f0.png)  
Step 2는 Step 1에서 찾은 오류 데이터에 대해서 가중치 값을 부여한다.   ![image](https://user-images.githubusercontent.com/66999675/131121349-86281fbf-139a-4cad-964d-3f4dacefa7e0.png)
가중치가 부여된 오류 + 데이터는 다음 약한 학습기가 더 잘 분류할 수 있게 크기가 커졌다.(가중치를 부여한 것을 크기가 커진 것으로 표현)

![image](https://user-images.githubusercontent.com/66999675/131121372-c44602ee-1cec-453f-a9c1-8ee933f8b147.png)    
  
Step 4에서는 잘못 분류된 - 데이터에 가중치 값을 부여한다.

![image](https://user-images.githubusercontent.com/66999675/131121398-4f227f1c-13cd-4005-b1e3-f0dbb6aaa0b7.png)  
Step5에서는 세 번쨰 약한 학습기가 분류 기준 3으로 +와 -를 분류하고 오류 데이터를 찾는다.

Adaboost는 이렇게 약한 학습기가 순차적으로 오류 값에 대해 가중치를 부여한 예측 결정 기준을 모두 결합해 예측을 수행한다.

![image](https://user-images.githubusercontent.com/66999675/131121490-c5bab2f1-8330-4422-9780-b47bc2a475bc.png)

마지막은 1, 2, 3번째 약한 학습기를 모두 결합한 결과 예측이다. 개별 약한 학습기보다 더 정확도가 높아졌음을 알 수 있다.

GBM은 Adaboost와 유사하나 가중치 업데이트를 경사 하강법을 이용한다.

일반적인 GBM은 랜덤 포레스트보다는 예측 성능이 조금 뛰어난 경우가 많이 있긴하나 수행 시간이 너무 오래걸리고 하이퍼 파라미터 튜닝도 많이 해야된다.

또한 Sklearn에서 GBM은 약한 학습기의 순차적인 예측 오류 보정을 통해 학습을 수행하므로 멀티 CPU 코어 시스템을 사용하더라도 병렬처리가 지원되지 않아서   
대용량 데이터의 경우 학습에 매우 많은 시간이 필요하다.
