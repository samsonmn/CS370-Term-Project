FROM node:current-slim

WORKDIR /home/kubeuser/term_project/CS370-Term-Project
COPY package.json .
RUN npm install

EXPOSE 8080
CMD [ "npm", "start" ]

COPY . .
