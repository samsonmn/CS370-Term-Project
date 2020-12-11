FROM node:current-slim

WORKDIR /home/kubeuser/term_project/CS370-Term-Project
COPY pom.xml .
RUN npm install

EXPOSE 8080

COPY . .
