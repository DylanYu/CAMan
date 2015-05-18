# CAMan
Dynamic Cloud Application Management System

## What is CAman?

## 环境配置

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

