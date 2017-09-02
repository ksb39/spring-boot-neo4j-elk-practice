server {
  listen 80 default;
  server_name localhost;

  location / {
    proxy_pass http://spring;
  }
}

upstream spring {
  server spring-boot:8888;
}