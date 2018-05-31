# MVPFrame

<div align=center>
<img src="https://raw.githubusercontent.com/Lrony/MVPFrame/master/images/MVP.png?raw=true">
</div>

一个Android MVP框架演示项目。

一个项目的前期准备是非常重要的，程序的框架就是其中一环。一个合适的框架可以大大减少开发以及维护难度等等...在MVVM还没盛行的时候，MVP仍然是首选框架之一。

下面我写了一个MVP的Demo，其中有自己对MVP的一些理解及优化，希望能帮助到大家~

温馨提示：建议先了解下MVP再来食用本Demo更佳！

# 示例项目
[IRead](https://github.com/Lrony/IRead) --基于MVPFrame

# 目录介绍

- `--base` Activity & Fragment Base类
- `--mvp` MVP的Base类都在这里面
- `--presentation` 主要包，其中的Contract类是定义View和Presenter接口的地方
- `--util` 共通工具包
- `App` Application
- `AppRouter` app路由，界面跳转帮助类，所有的界面跳转通过此类进行跳转,包括组件交互

## 代码

<div align=center>
<img src="https://raw.githubusercontent.com/Lrony/MVPFrame/master/images/CODE.png?raw=true">
</div>

## 项目截图

<img src="https://raw.githubusercontent.com/Lrony/MVPFrame/master/images/Screenshot_0.png?raw=true" width="200"> <img src="https://raw.githubusercontent.com/Lrony/MVPFrame/master/images/Screenshot_1.png?raw=true" width="200">

## 感谢

Fragment 管理: [Fragmentation](https://github.com/YoKeyword/Fragmentation)

## 下载

DemoAPK: [Download](https://github.com/Lrony/MVPFrame/blob/master/app-debug.apk?raw=true)
