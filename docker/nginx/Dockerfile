FROM ubuntu
RUN apt-get update && apt-get install -y nginx
RUN ln -sf /dev/stdout /var/log/nginx/access.log
RUN ln -sf /dev/stderr /var/log/nginx/error.log
RUN rm -rf /etc/nginx/sites-enabled/default
EXPOSE 80 443
COPY config/mysite.com /etc/nginx/sites-enabled/mysite.com
CMD ["nginx", "-g", "daemon off;"]