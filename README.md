# Imitate WeChat

一个 Android 大作业（（（

> 因为我 kotlin 比 Java 好点，所以用的 kotlin

## 要求

1. 项目运行之后先进入注册界面，输入相应内容后，点击“注册”按钮可跳转至登录界面；

2. 注册界面中，整体背景色为“#EDEDED”，字体颜色为“#000000”；标准字号为20dp，特殊字号可根据个人感觉设置；账号必须输入自己的手机号；密码输入框要使用“textPassword”类型；其它不做具体要求，美观即可；

3. 注册Activity中，需要判断昵称、用户名、密码是否为空，只要有一个为空，就无法跳转，并使用Toast给出提示“请输入昵称或用户名或密码”；如果均不为空，使用intent.putExtra(***)方法将账号和密码传递到登录Activity中；

4. 登录界面中，整体背景颜色为“#EDEDED”，字体颜色为“#000000”（黑色）和“#737FA0”（浅蓝色）两种；标准字号为15dp,特殊字号可根据个人感觉设置；将账号显示在头像下面；密码输入框要使用“textPassword”类型；其它不做具体要求，美观即可；

5. 登录Activity中，使用“Intent intent = getIntent（）；”方法获取传递过来的intent对象，并使用intent.getStringExtra(***)方法获取传递过来的账号和密码；输入密码后，点击登录按钮，判断密码是否正确，如果正确，使用Toast提示“登录成功”，如果不正确，使用Toast提示“密码错误，请重新输入”；其它跳转不做具体要求；

6. 在设计界面时，要善于使用layout_margin和layout_left定位组件的位置。

## 截图

### 注册

![](docs/register.png)

### 登录

![](docs/login.png)