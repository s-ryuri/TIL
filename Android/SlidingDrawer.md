SlidingDrawer는 위젯을 서랍처럼 열어서 보여주거나 닫아서 감춘다.

```java
<?xml version="1.0" encoding="utf-8"?>

<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context=".MainActivity">

    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="slidingDrawer 바깥"
        android:gravity="center"
        android:textSize="20sp"/>

    <SlidingDrawer
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:content="@+id/content"
        android:handle="@+id/handle">

        <Button
            android:id="@+id/handle"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="서랍 손잡이" />

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:id="@+id/content"
            android:background="#00FF00"
            android:gravity="center">

            <TextView
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="서랍 안입니다."/>
        </LinearLayout>
        
    </SlidingDrawer>

```

SlidingDrawer에는 규칙이 있다.  
일단 SlidingDrawer의 handle 속성에 저장된 이름과 SlidingDrawer의 손잡이 역할을 하는 버튼의 id가 동일해야한다.  
또한 SlidingDrawer의 content 속성에 지정된 이름과 LinearLayout의 id도 동일 해야한다.  

![image](https://user-images.githubusercontent.com/66999675/135288878-9fa3797a-21e3-4c62-8d38-f191af71bd83.png)  



https://user-images.githubusercontent.com/66999675/135288922-bc9c1638-cb0b-41c5-b602-9fb1951f64ff.mp4


