# CAMan
Dynamic Cloud Application Management System

## 前言

CAMan (Cloud Application Management System) 是一种基于模型的云应用动态管理技术。该技术在Eclipse Modeling Framework上实现，并且结合了Graphic Modeling Framework提供上层图形用户界面。

## 环境配置

**注意**：所有环境配置在Windows 7平台进行过完整的测试，尽管我相信在其他平台同样可以正确运行，但无法完全保证，如果出现问题请参阅*常见错误处理*寻找灵感。

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
，[Windows 64 Bit](https://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/luna/SR2/eclipse-modeling-luna-SR2-win32-x86_64.zip)
，其他平台的下载请到Eclipse官网搜索。

经测试，Indigo版本也同样可以使用，下载地址：
[Eclipse Modeling Tool Indigo](https://www.eclipse.org/downloads/packages/eclipse-modeling-tools/indigosr2)

### SM@RT插件

从[这里](http://smatrt.googlecode.com/files/smatrt.zip)下载SM@RT，获得一个压缩文件，里面是一些eclipse插件（\*.jar文件）。以标准方式安装这些插件，即将这个压缩文件复制到你的eclipse安装路径下，通常是"\*/eclipse/"的形式，在这个路径下可以找到**eclipse.exe**文件，以及一些子文件夹比如“features”、“plugins”，解压缩这个文件，并将5个插件放到“plugins”文件夹下。

### GMF

如果你的Eclipse Modeling Tool中没有GMF插件，则可以打开*Help*的*Install Modeling Components*，搜寻“Graphic Modeling Framework"并安装。

## 使用方法

如果你只想尝试使用一下该技术，但并不想进行完整的开发，请参照以下步骤（以Web应用管理系统为例）。

1. 打开配置好的Eclipse Modeling Tool，导入**Web**目录中的**OSModel**项目，注意不需要导入其他以OSModel开头的项目。
2. 以Ecore视图打开**model**文件夹中的**OSModel.ecore**，修改其Name和URI属性为自己想要的设置
3. 新建**EMF Generator Model**，选择导入刚刚的**OSModel.ecore**，用该genmodel生成除了**Model Code**之外的其他Code。
4. 打开**OSModel.decmodel**，右键**Load Resources**导入Ecore模型和Genmodel，在**SandTablist**选项卡中点击**Generate Adapter**，
将会生成主要的同步引擎代码。
5. 运行生成的同步引擎。在**OSModel**项目上右键选择**Run As**，以及**Eclipse Application**。将会启动一个新的runtime eclipse，
新建**Example EMF Model Creation Wizards**，并选择之前指定的模型名字。
6. 在新建的运行时模型上增加、删除、修改元素，查看效果。
7. 在原来的Eclipse中右键**OSModel.gmfgen**，然后选择**Generate diagram code**，会生成一个新的项目。启动该项目，
并新建**Examples**中的**Diagram**模型，即可以使用拖放式图形用户界面。

## 开发过程

完整的开发过程分为以下几个步骤：

1. 开发Ecore元模型
2. 开发decmodel存取模型
3. 生成同步引擎
4. 开发GMF model
5. 生成图形用户界面

下面分别从这几个方面介绍具体的开发过程。

### 开发Ecore元模型

在Eclipse Modeling Tool中新建Empty EMF Project，在model文件夹中新建一个**Ecore Model**，会新生成以.ecore结尾的元模型文件，
设置Name，Ns Prefix和Ns URI并保持一致性，这些名字在后面会有作用，模型中新建EPackage、EClass和EAnnotation、EAttribute、EReference等模型元素。

####类

EClass表示了一个实体，如虚拟机、Apache构件，我们可以根据实际需求把现实世界中的事物抽象为类，并给予不同的粒度。EClass可以设置为**Abstract**，
意味着该类不能被实例化，只能被其他类继承，可以作为一种公共基类使用，如所有软件构件的类都可以有一定的共性，因此，我们可以创建一个Software类来
定义软件构件的公共属性和关系，然后让其他所有的软件构件类都继承Software类。

我们在实际开发中会创建Image、Server、Flavor、FloatingIP等云端硬件构件相关的类，以及Softwarte、Apache、MySQL等软件构件相关的类。

####属性

EAttribute表示了实体的一个具体属性，如虚拟机的power_state，Apache的listening_port，这些属性可以被赋予不同的类型，如Int，String，List等。EMF允许
对属性设置默认值（Default Value Literal），以及upper_bound和lower_bound，可以用于设置属性的实际性质。

属性设置中有一些特殊部分。**Derived**设置为true说明该属性的值是由其他属性的值导出的，因此只有显示的作用，不能设置值；**ID**设置为true说明该属性的值
一定和其他对象中的值不同；Changeable设置为false则直接说明该属性值不可更改。在实际使用中这些属性的设置选项应该和实际应用场景相匹配。

####关系

### 开发decmodel存取模型

### 生成同步引擎

### 开发GMF Model

开发GMF Model是为了可以生成图形用户界面，一共分为以下几个方面：

1. **模型图形定义**

    元模型中所有的类、属性和关系在图形用户界面中都可以拥有专属的图形定义，并为该图形定义搭配描述，图形定义
的描述详细定义了图形的各类属性，如线型、线宽、填充方式等，对于关系型的图形，还需要定义起始点和终止点。
对于不需要在图形用户界面中显示的模型元素我们可以不为其创建图形。我们在这里定义了Server、Apache、PHP、
WebApp和MySQL作为点，Apache、PHP、WebApp和MySQL到Server的**hostOn**关系以及PHP到
Apache、WebAPP到PHP、WebApp~到MySQL的依赖关系作为线，并分别调整了这些图形的外观

2. **基础工具**

    编写基础工具是为了将所有的类和关系进行注册，是实现“拖放式部署”的基础，每一个工具都对应了一个图形界面
上的拖放操作，在这里注册的工具与存取模型中的具体操作会对应起来。我们在这里编写了Apache、PHP、WebApp
和MySQL连接到Server时会触发的安装操作，WebApp连接到PHP和MySQL会触发的配置操作，以及Server被生成会触发的创
建云端实例操作。

3. **映射模型和生成模型**

    映射模型将基础工具和定义的图形进行一一映射，将类映射为点，关系映射为线，并且把元模型和存取模型进行映射。
我们可以在映射过程中进行具体参数的配置，如类的实例显示的属性项，还需要定义操作对应的监听内容。编写完这个映
射模型后可以用其导出生成模型。我们在这里最终将基础工具、图形定义和存取模型全部结合起来，并确保其对应关系的
正确性。由于~GMF~自身的问题，默认情况下映射关系无法维持，我们必须手工将其调整正确。
    

### 生成图形用户界面

修改生成模型中的插件配置，并对前述映射模型中的配置进行个性化修改，然后使用生成模型生成图形用户界面的
插件，可以导出该插件或直接作为Eclipse Application运行。在启动的Eclipse Application中，创建一个后缀
的diagram的运行时模型，这个模型会与一个不带diagram后缀的无图形用户界面模型相对应
，它们表示的信息是完全一致的。


## 常见错误处理

如果出现错误，请查看下面的内容是否能够帮助你

1. gmfgen生成diagram时一直报boolean类型相关错误
>将project的Java版本临时改成jre6，重新生成genmodel，再使用新的gmfgen进行后续步骤。

2. 新建GMF工具时没有任何选项
> 新建GMF Mapping时一定要从root开始。

3. 生成的同步引擎代码中有类型错误
> genmodel中的Model Class Default：Root Extends Class改成org.eclipse.emf.ecore.impl.EObjectImpl

4. 无法增加新的依赖
> 复制依赖库到在lib文件中，在Eclipse中打开MANIFEST.MF，点击Runtime选项卡，，将新增的依赖库加入Classpath。然后
点击Dependencies选项卡，增加依赖的项目，并且勾选"Show non-exported package"。

5. 运行项目是报依赖不满足的错误
> 将"cn.pku"开头的几个包全部加到依赖中，注意是在Dependencies的Reguired Plugin-ins中添加

6. 生成虚拟机时报了OpenStack相关的错误
> 使用OpenStack API时一定要配合JDK 1.7使用，其他版本都无法正常运行。

7. 更换GMF图标后重新运行并没有载入最新的图标
> 图标文件一定要以.gif为后缀，不接受其他格式的图片，且请确保图片放在了icons/full/obj16文件夹内

8. 试在SandTablist选项卡中生成代码时相应按钮为灰色
> 关闭decmodel，重新载入所有相关资源，再进行尝试。
