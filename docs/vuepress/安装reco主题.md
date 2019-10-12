---
title: vuepress-theme-reco主题使用
date: 2019-10-07
categories:
 - VuePress
tags:
 - vuepress
sidebar: true
---
# 安装与使用
## 安装
```bash
npm install vuepress-theme-reco -dev--save
# or
yarn add vuepress-theme-reco
```
## 使用
```bash
// 修改 /docs/.vuepress/config.js
module.exports = {
  theme: 'reco'
} 
```
# 标签与分类
## 博客配置
```bash
// change /docs/.vuepress/config.js

module.exports = {
  theme: 'reco',
  themeConfig: {
     // 博客设置
    blogConfig: {
      category: {
        location: 2,     // 在导航栏菜单中所占的位置，默认2
        text: 'Category' // 默认文案 “分类”
      },
      tag: {
        location: 3,     // 在导航栏菜单中所占的位置，默认3
        text: 'Tag'      // 默认文案 “标签”
      }
    }
  }  
} 
```
## 为文章设置分类和标签
```bash
--- 
title: 【vue】跨域解决方案之proxyTable  
date: 2017-12-28
categories: 
 - frontEnd
tags: 
 - vue
---
```

::: warning 注意
`categories` 和 `tags` 要以数组的方式填写。
:::

::: tip 提示
某些页面的侧边栏为 `false` 呢？因为您启用了分类，这与自定义侧边栏功能有点冲突，所以您全局打开自动侧边栏功能，然后在不需要侧标记的地方关闭它。
:::

# 添加时间轴
## 添加导航按钮
```bash
// change /docs/.vuepress/config.js

module.exports = {
  theme: 'reco',
  themeConfig: {
    nav: [
      { text: 'TimeLine', link: '/timeLine/', icon: 'reco-date' }
    ]
  }    
} 
``` 
## 添加所需的文件
`/docs/timeLine/README.md`

```bash
---
isTimeLine: true
sidebar: false
isComment: false
---

## Time Line
```
