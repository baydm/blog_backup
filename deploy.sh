#!/usr/bin/env sh

# 确保脚本抛出遇到的错误
set -e

# 生成静态文件
yarn g

# # 进入生成的文件夹
cd docs/.vuepress/dist

# 如果是发布到自定义域名
# echo "# yshye.github.io" >> README.md
echo 'www.170728.xyz' > CNAME
git init
git add CNAME
git commit -m "first commit"
git add .
git commit -m 'add docs'
git remote add origin https://github.com/yshye/yshye.github.io.git
git push -u origin master -f

# 删除编译后的结果
cd ../
rm -rf dist
mkdir dist

# 备份源码
cd ../../
if [ -d "_git" ]; then
 mv  _git .git
fi

git add .
git commit -m '备份博客源码'
git push origin master 

# 修改.git名称
mv .git _git
