# react-native-qrcode
## 生成二维码和扫描二维码，支持原声android端
***话不多说，先看效果，是您想要的，再在看用法***

> 扫描二维码

![image](https://github.com/fangcaiwen/react-native-qrcode/blob/master/%E6%89%AB%E6%8F%8F%E4%BA%8C%E7%BB%B4%E7%A0%81.jpg)

> 生成二维码

![image](https://github.com/fangcaiwen/react-native-qrcode/blob/master/%E7%94%9F%E6%88%90%E4%BA%8C%E7%BB%B4%E7%A0%81.jpg)

> 用法如下：
1.暂时没有上传npm，所以不妨直接 

```git clone https://github.com/fangcaiwen/react-native-qrcode.git```

到rn项目的node_modules下

2.执行```react-native link react-native-qrcode```;

3.手动配置，找到android app下的AndroidManifest.xml下手动添加 

```<activity android:name="com.react_native_qrcode.QrCodeActivity" />```,

然后添加

``` <uses-permission android:name="android.permission.CAMERA"/>
    <uses-permission android:name="android.permission.FLASHLIGHT" /> ```

