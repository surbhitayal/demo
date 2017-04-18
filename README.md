# Introduction
i'm modifying this file a bit and this is the only modification lol
The following project is aimed at a tutorial showing how ANT/Maven can be combined together. 
It consists of some sample code, which can then be compiled and packed using ant/maven
The default is a very old old version and depends on ant-contrib v 1.0b2 (1.03 has severe issues and breaks the script!)

Use these files as base and extend to update them as per requirements of assignment/project. 

## Required Software
* Maven 
* ANT 
* Java (preferrably JDK 7+)
* PMD (Optional - if not installing it, remove references to PMD in Ant build files)
* Cobertura (Optional, bu recommended)

### Installing PMD
* Download PMD from https://github.com/pmd/pmd/releases/download/pmd_releases%2F5.4.0/pmd-bin-5.4.0.zip 
* Unzip file to c:\apps\pmd 
* Set System Variable PMD_HOME to c:\apps\pmd

### Installing Maven
* Download MAven and unzip to a folder
* set MAVEN_HOME to name of folders where it was unzipped. 

### Installing ANT
* Download MAven and unzip to a folder
* set ANT_HOME to name of folders where it was unzipped. 

### Additional config 
* download and copy following files to %ANT_HOME%\lib folder 
 * sonarqube-ant-task-2.4.jar
 * ant-contrib.jar  (Download from from http://sourceforge.net/projects/ant-contrib/files/ant-contrib/ant-contrib-1.0b2/ (Do not use 1.0b3))
 * maven-ant-tasks-2.1.3.jar
* Adjust paths in build.xml/build.properties as per your local configuration

