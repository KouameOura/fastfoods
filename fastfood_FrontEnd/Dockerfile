FROM node:16
RUN mkdir -p /usr/src/app
WORKDIR /usr/src/app
COPY package.json /usr/src/app
RUN npm install
COPY . /usr/src/app

# start app
CMD node_modules/.bin/ng serve --host 0.0.0.0 --port 4200 --disable-host-check