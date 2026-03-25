@echo off

REM Start SonarQube Server
cd /d "D:\workspace\sonarqube-26.3.0.120487\bin\windows-x86-64"
call StartSonar.bat

REM Run SonarQube Analysis for TENANTS-APP
cd /d "D:\workspace\QTM\TENANTS-APP"
cmd /c mvn sonar:sonar "-Dsonar.host.url=http://localhost:9002" "-Dsonar.token=squ_0326a7db3fa938837caab67e4e01803a39289aab"

REM Run SonarQube Analysis for QTMPatients
cd /d "D:\workspace\QTM\QTMPatients"
cmd /c mvn sonar:sonar "-Dsonar.host.url=http://localhost:9002" "-Dsonar.token=squ_0326a7db3fa938837caab67e4e01803a39289aab"

REM Run SonarQube Analysis for QTMDashboard
cd /d "D:\workspace\QTM\QTMDashboard"
cmd /c mvn sonar:sonar "-Dsonar.host.url=http://localhost:9002" "-Dsonar.token=squ_0326a7db3fa938837caab67e4e01803a39289aab"

REM Run SonarQube Analysis for QTMCommonLib
cd /d "D:\workspace\QTM\QTMCommonLib"
cmd /c mvn sonar:sonar "-Dsonar.host.url=http://localhost:9002" "-Dsonar.token=squ_0326a7db3fa938837caab67e4e01803a39289aab"

@echo SonarQube analysis completed.