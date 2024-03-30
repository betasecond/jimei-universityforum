#!/bin/bash
# for project jimei-university forum
default_project_name="jimei-universityforum"
# 检查是否传入项目名称
if [ "$#" -ne 1 ]; then
    echo "No project name provided. Using default: ${default_project_name}"
    project_name="${default_project_name}"
    exit 1
else
  # 设置项目名称变量
  project_name="$1"
fi



sudo docker build -t my-custom-postgres:13 .
sudo mkdir -p "/opt/${project_name}/postgres/data"
sudo mkdir -p "/opt/${project_name}/postgres/init-scripts"
sudo docker run --name "${project_name}-postgres" -d \
    -p 6000:5432 \
    -v "/opt/${project_name}/postgres/data:/var/lib/postgresql/data" \
    -v "/opt/${project_name}/postgres/init-scripts:/docker-entrypoint-initdb.d/"  \
    my-custom-postgres:13
