# Factorplot과 Pointplot

캐글 필사를 의문이 생겨서 구글링 해보다가 원하는 답변이 안 나와서 캐글 오픈톡방에 한 번 올려봤다.  

![image](https://user-images.githubusercontent.com/66999675/131687242-56aa4991-6436-45ae-92ab-8b009afb2dc7.png)  

나의 궁금증은 위의 코드처럼 작성했을 때 왜 빈 그래프가 만들어지고 factorplot은 왜 아래에 있게 되는 지가 의문이었다.  
subplots(1,2)로 만들고 factorplot에 ax = ax[1]을 넣어줬기에 그래프가 barplot, factorplot 딱 2개만 만들어져야 된다고 생각했는데 위의 사진처럼 생겨서 궁금증이 생겼다.

stackoverflow에 내가 원하는 답변이 딱 있었다.
https://stackoverflow.com/questions/54959764/seaborn-factorplot-generates-extra-empty-plots-below-actual-plot  

catplot or factorplot are figure level functions. This means that they are supposed to work on the level of a figure and not on the level of axes.  

이거 발견해서 자문자답할까 했다가 한 번 기다려봤는데 답변이 왔다.  

![image](https://user-images.githubusercontent.com/66999675/131687404-41ad1360-27f7-40d3-aceb-e79c9fa0084e.png)  
factoplot은 figure-level이라서 ax에 적용이 안되고 새로운 figure을 만들어서 위와 같은 결과가 나온다는 것이다.   
똑같이 생긴 pointplot은 axes-level에서 적용되기에 pointplot을 사용하면 된다.



