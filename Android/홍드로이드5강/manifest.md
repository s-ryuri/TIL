
```java
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="com.example.android5">

    <application
        android:allowBackup="true"
        android:icon="@mipmap/ic_launcher"   <!-- 런처 아이콘 변경 -->
        android:label="@string/app_name" <!-- 프로젝트 이름 원하는 이름으로 빌드 가능 -->
        android:roundIcon="@mipmap/ic_launcher_round" <!--테투리를 약간 둥글게 해줌-->
        android:supportsRtl="true"
        android:theme="@style/Theme.Android5"> <!--기본적인 테마 설정-->
        <activity <!--엑티비티 선언을 담당-->
            android:name=".MainActivity"
            android:exported="true">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" /> <!--런처를 실행시킬 때 처음 시작하는 런처가 어디냐 먼저 시작하는 곳-->
            </intent-filter>
        </activity>
    </application>

</manifest>
```
