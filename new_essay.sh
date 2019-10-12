#!/usr/bin/env sh

# 确保脚本抛出遇到的错误
set -e

# 进入生成的文件夹
# if [$1 = a];then
#     cd docs/algorithm
# else 
cd docs/essay
# fi

data=$(date "+%Y%m%d%H%M%S")
time=$(date "+%Y-%m-%d %H:%M:%S")
if [ ! -f "${data}.md" ]; then
 echo "---
date: ${time}
---
# $1
&emsp;&emsp;

::: tip 小贴士
##### 
:::
" > "${data}.md"
# 添加左侧导航栏
 sed -i "7i '${data}'," sidebar.js
 echo "$1创建成功！"
else
 echo "$1已经存在！"
fi

