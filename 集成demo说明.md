## 集成
### 方式
编写 demo 调试 spring 源码，应该和其他模块如 jdbc 等方式一致：
1. 作为 spring-framework 工程的子模块；
2. 模块为 gradle 工程；
3. 修改 demo 的 gradle 构建脚本的名称为 project-name.gradle,因为在 spring-framework 工程的设置脚本中有
```
rootProject.children.each {project ->
   	project.buildFileName = "${project.name}.gradle"
   }
```
根据工程名找到构建脚本，否则在构建 spring-framework 工程时不会构建 demo 的工程，无法引入依赖。

### 注意
1. 如果不是作为 spring-framework 工程的子模块，依赖时应该依赖模块的 jar 包