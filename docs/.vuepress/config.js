module.exports = {
    title: '枫叶的世界',
    description: 'JsonYe的个人网站',
    head: [ // 注入到当前页面的 HTML <head> 中的标签
        ['link', { rel: 'icon', href: '/favicon.ico' }], // 增加一个自定义的 favicon(网页标签的图标)
        ['link', { rel: 'manifest', href: '/avatar.jpg' }],// 注入到当前页面的 HTML <head> 中的标签
        ['link', { rel: 'apple-touch-icon', href: '/favicon.ico' }],
    ],
    serviceWorker: true, // 是否开启 PWA
    base: '/', // 这是部署到github相关的配置
    // 代码块显示行号
    markdown: { lineNumbers: true },
    // theme: '@vuepress/vue',
    themeConfig: {
        // 作者
        author: 'JsonYe',
        nav: require("./nav.js"),
        sidebar: require("./sidebar.js"),
        // 显示所有页面的标题链接
        displayAllHeaders: true, // 默认值：false
        sidebarDepth: 2,
        // 最后更新时间
        lastUpdated: true,
        lastUpdated: '最后更新时间',
        serviceWorker: {
            updatePopup: {
                message: "有新的内容",
                buttonText: '更新'
            }
        },
        // sidebar: 'auto'
        // 显示华为文案
        // huawei: true
    }
};