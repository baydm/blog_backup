#!/usr/bin/env sh

# 确保脚本抛出遇到的错误
set -e

# 进入生成的文件夹
# if [$1 = a];then
#     cd docs/algorithm
# else 
cd docs/algorithm
# fi

data=$(date "+%Y%m%d%H%M%S")
time=$(date "+%Y-%m-%d %H:%M:%S")
if [ ! -f "${data}.md" ]; then
 echo "---
date: ${time}
---
# $1
## 题目

## 示例

## 我的方案
>

### Java源码
\`\`\`java

\`\`\`

### Dart源码
\`\`\`dart

\`\`\`

## 推荐方案
> 

### Java源码
\`\`\`java

\`\`\`

### Dart源码
\`\`\`dart

\`\`\`

::: tip
##### 
:::
" > "${data}.md"
# 添加左侧导航栏
 sed -i "2i '${data}'," sidebar.js
# 添加源码目录
cd code
mkdir "$1"
cd "$1"

# 添加Java源码
echo "
/**
* $1
*/
class Code {
    public static void main(String[] args) {

    }
}" > Code.java

# 添加dart源码
echo "
/// $1
main() {
    
}" > Code.dart

 echo "$1创建成功！"
else
 echo "$1已经存在！"
fi

