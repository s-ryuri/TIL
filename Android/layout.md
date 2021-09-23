![image](https://user-images.githubusercontent.com/66999675/134458563-985892f4-6e26-49e1-a779-331b34389f43.png)  

기본적인 EditText는 테두리 없고 밑줄이 쳐진 형태로 나오게 된다.  
인스타 클론 코딩을 하고 있는데 인스타는 밑에 두 개처럼 생겨서  
어떻게 꾸미는지 알아보았다.  

![image](https://user-images.githubusercontent.com/66999675/134458583-801ff7da-268d-46c4-8454-b421f6e75633.png)  

drawable -> new -> Drwable Resource File을 누른다.  
![image](https://user-images.githubusercontent.com/66999675/134458589-118df29e-db10-4e0e-9bea-976e9a5c7ee1.png)  
누르면 이런 화면이 나오는데 원하는 이름으로 지정해 주면 된다.  

```java
  <?xml version="1.0" encoding="utf-8"?>
<!--        테두리 둥글고 밑 줄 없애주고 배경색깔 다 넣어줌-->
<shape xmlns:android="http://schemas.android.com/apk/res/android"
    android:padding="10dp"
    android:shape="rectangle">

    <stroke android:width="2dp"
        android:color="#E2E2E2"/>

    <solid android:color="#F8F8F8"/>
    <corners
        android:topLeftRadius="4dp"
        android:topRightRadius="4dp"
        android:bottomLeftRadius="4dp"
        android:bottomRightRadius="4dp"/>

</shape>
```  

xml 파일이 생성되는데 위의 코드를 넣어주면  

테두리가 둥글고 밑 줄을 없애주고 배경 색깔까지 넣어준다.

```java
<shape xmlns:android="http://schemas.android.com/apk/res/android"
    android:padding="10dp"
    android:shape="rectangle">
```
테두리를 설정해 준다 padding 10dp, 모양을 직사각형으로  

```java
<stroke android:width="2dp"
        android:color="#E2E2E2"/>
```
테두리 색깔을 지정해 준다.  

```java
<solid android:color="#F8F8F8"/>
```

layout의 배경 색깔을 지정해 준다.  

```java
 <corners
        android:topLeftRadius="4dp"
        android:topRightRadius="4dp"
        android:bottomLeftRadius="4dp"
        android:bottomRightRadius="4dp"/>
 ```  
테두리를 둥글게 만들어주기 위해서 Radius를 넣어준다.  

마지막으로 위젯에 backgroud를 이용해서 사용해 주면 된다.

```java
<EditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="@string/login_id"
        android:background="@drawable/edit_round" // 이 부분
        android:layout_marginBottom="10dp"
        android:padding="10dp"/>
```
