<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8" />
    <title></title>
</head>
<body>
${name}
<div>
    <p>我的页面内容</p>
    <p>我今年${age}</p>
    <#if sex=="0">
        男
        <#elseif sex="1">女
        <#else>其他
    </#if>
    <#if age gt 17>
        成年
    <#else>未成年
    </#if>
    <#list userList as user>
        ${user}
    </#list>
</div>
</body>
</html>