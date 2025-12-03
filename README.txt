Readme: todo-project_OndassynovDaulet
Files included:
- Dockerfile_OndassynovDaulet
- docker-compose_OndassynovDaulet.yml
- Jenkinsfile_OndassynovDaulet
- k8s/*.yaml (deployment, service, configmap, secret)
- playbook_OndassynovDaulet.yml
- pom.xml and minimal Spring Boot src/...
How to build:
1) mvn -B clean package
2) docker build -f Dockerfile_OndassynovDaulet -t ondassynovdaulet/todo-app:1.0 .
3) docker-compose -f docker-compose_OndassynovDaulet.yml up --build
