## SonarScanner for Gradle

参考：https://docs.sonarqube.org/latest/analysis/scan/sonarscanner-for-gradle/

### gradle.properties中配置变量

 + systemProp.sonar.host.url
 + systemProp.sonar.login

sonar.login的Token在sonarqube Administrator-Security中生成。

### 定义Gradle Task：sonarqube

build.gradle中定义Gradle Task：sonarqube，需要报Gradle的执行环境改成JDK11。参考：[sonarqube-analysis-with-java-11](https://docs.sonarqube.org/latest/analysis/analysis-with-java-11/) 。

## SonarScanner for Jenkins

参考：https://docs.sonarqube.org/latest/analysis/scan/sonarscanner-for-jenkins/

1. jenkins安装SonarScanner插件
2. 系统配置中配置sonarqube server的host url和login token。

## 统计测试覆盖率

参考：
+ https://tomgregory.com/how-to-measure-code-coverage-using-sonarqube-and-jacoco/
+ https://docs.gradle.org/current/userguide/jacoco_plugin.html

1. test阶段使用jacoco插件生成测试覆盖率报告
2. sonarqube阶段上传xml格式的测试覆盖率报告