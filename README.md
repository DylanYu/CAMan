# CAMan
Dynamic Cloud Application Management System

## What is CAman?

CAMan (Cloud Application Management System) 是一种基于模型的云应用动态管理技术。该技术在Eclipse Modeling Framework上实现，并且结合了Graphic Modeling Framework提供上层图形用户界面。

## 环境配置

**注意**：所有环境配置在Windows 7平台进行过完整的测试，尽管我相信在其他平台同样可以正确运行，但如果出现问题请参阅*常见错误处理*寻找灵感。

### Java环境

本技术的多项依赖技术都需要特定的Java版本，经实际测试Java SE 1.6或1.7可以在大多数情况下满足要求，
对于特殊情况请参阅*常见错误处理*。

下载地址：

[Java SE Development Kit 6](http://www.oracle.com/technetwork/java/javase/downloads/java-archive-downloads-javase6-419409.html)

[Java SE Development Kit 7](http://www.oracle.com/technetwork/java/javase/downloads/jdk7-downloads-1880260.html)

### Eclipse以及相关插件

SandTablist插件需要Eclipse Modeling Framework 3.4，Eclipse-OCL 1.3, EMF-Transaction 1.3, Graphical Modeling Framework (GMF) 2.1。在实际使用中推荐下载Eclipse Modeling Tool，该工具集成了绝大多数相关框架和插件。

下载地址：

Eclipse Modeling Tool Luna [Windows 32 Bit](https://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/luna/SR2/eclipse-modeling-luna-SR2-win32.zip)
[Windows 64 Bit](https://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/luna/SR2/eclipse-modeling-luna-SR2-win32-x86_64.zip)
，其他平台的下载请到Eclipse官网搜索。

经测试，Indigo版本也同样可以使用，下载地址：
[Eclipse Modeling Tool Indigo](https://www.eclipse.org/downloads/packages/eclipse-modeling-tools/indigosr2)

### SM@RT插件

从[这里](http://smatrt.googlecode.com/files/smatrt.zip)下载SM@RT，获得一个压缩文件，里面是一些eclipse插件（\*.jar文件）。以标准方式安装这些插件，具体而言，将这个压缩文件复制到你的eclipse安装路径下，通常是"\*/eclipse/"的形式，在这个路径下可以找到**eclipse.exe**文件，以及一些子文件夹比如“features”、“plugins”。解压缩这个文件，并将5个插件放到“plugins”文件夹下。

### GMF

如果你的Eclipse Modeling Tool中没有GMF插件，则可以打开*Help*的*Install Modeling Components*，搜寻“Graphic Modeling Framework"并安装。

## 使用方法

## 开发过程

## 常见错误处理


如果出现错误，请查看下面的内容是否能够帮助你

1. gmfgen生成diagram时一直报boolean类型相关错误

>将project的Java版本临时改成jre6，重新生成genmodel，再使用新的gmfgen进行后续步骤。

2. 新建GMF工具时没有任何选项

> 新建GMF Mapping时一定要从root开始。

3. 生成的同步引擎代码中有类型错误

> genmodel中的Model Class Default：Root Extends Class改成org.eclipse.emf.ecore.impl.EObjectImpl

