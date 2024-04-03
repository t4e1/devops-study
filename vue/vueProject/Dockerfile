FROM node:lts-alpine

#curl 설치 (Client url): 필수는 아님(postman 같은 느낌)
RUN apk add --no-cache curl

WORKDIR /app
COPY . ./
RUN npm install

CMD ["npm", "run", "dev", "--", "--host", "0.0.0.0"]
