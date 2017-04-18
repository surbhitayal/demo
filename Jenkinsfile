node {
   def mvnHome
   def version 
   stage('Preparation') {
      git 'https://github.com/surbhitayal/demo.git'
      mvnHome = tool 'merimaven'
	  version = '2.3.5' 
   }
   stage('Build') {
        withMaven(
        maven: 'merimaven', // Maven installation declared in the Jenkins "Global Tool Configuration"
        mavenSettingsConfig: 'settings.xml', // Maven settings.xml file defined with the Jenkins Config File Provider Plugin
        mavenLocalRepo: '/opt/maven/conf') {

      if (isUnix()) {
         sh "'${mvnHome}/bin/mvn' -Dmaven.test.failure.ignore test -Pfunctional-test -DSkipUTs=true -DskipTests=true"
      } else {
         bat(/"${mvnHome}\bin\mvn" -Dmaven.test.failure.ignore test -Pfunctional-test -DSkipUTs=true -DskipTests=true/)
      }
    } // withMaven will discover the generated Maven artifacts, JUnit reports and FindBugs reports
    

   }
   stage('Results') {
      junit '**/target/surefire-reports/TEST-*.xml'
      archive 'target/*.jar'
   }
     stage('DeployToServer') {
	 } 
} 
