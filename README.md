# spring-framework-5.x

学习spring-framework-5.x源码

# 源码编译

> > https://blog.csdn.net/baomw/article/details/83956300
>
> # spring介绍
>
> > https://blog.csdn.net/huyang0304/article/details/82935955
> >
> >

# 我的源码构建过程
> 1、安装好gradle 4.9 ，jdk 8 ，idea 2018
* gradle下载地址 http://services.gradle.org/distributions/

> 2、导入包，显示报错，删除了编译的包

> 3、单独编译spring-oxm包发现循环依赖的错，修改kotlinVersion为1.2试一下，漫长的等待
* 参考 https://blog.csdn.net/lianjiaokeji/article/details/82177236
 
# 问题提

* 1、gradle版本要为5.0
* 1.引入com.gradle.build-scan版本

* 编译报错 https://blog.csdn.net/hyldtc/article/details/52443083
* 解析schma.zip报错

* https://blog.csdn.net/u013310075/article/details/80707098