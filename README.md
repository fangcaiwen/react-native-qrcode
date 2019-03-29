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

```<uses-permission android:name="android.permission.CAMERA"/>```
```<uses-permission android:name="android.permission.FLASHLIGHT" />```

4.检查配置：

检查app下的build.gradle 

```
dependencies {
   // add line
    compile project(':react-native-qrcode')
    ...
}
```

检查settings.gradle

```
rootProject.name = 'xxxx'
// add line
    include ':react-native-qrcode'
    project(':react-native-qrcode').projectDir = new File(rootProject.projectDir, '../node_modules/react-native-qrcode/android')
...
include ':app'

```
检查MainApplication
```
 @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
          new MainReactPackage(),
          // add line
          new QrcodePackage(),
          ...  
      );
    }
```
