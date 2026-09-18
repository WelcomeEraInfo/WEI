登录proot内linux发行版
proot-distro login "发行版名称"

git初始化
git init

git配置用户名
git config --global user.name "用户名"

git配置邮箱地址
git config --global user.email "邮箱地址"

git查看当前状态
git status

git查看主线和分支
git branch

git查看配置列表
git config list

git暂存当前目录
git add .

git提交
git commit -m "提交信息"

git查看提交历史
git log

git查看提交历史 简化为一行
git log --oneline

git展示最近一次提交的修改
git show

git加哈希值展示对应提交的更改 示例哈希值e6ceccb
git show e6ceccb

git查看工作区修改的详细内容
git diff

git查看暂存区修改的详细内容
git diff --cached

ssh绝对路径启动sshd 前台运行-D参数 日志输出到前台-e 指定配置-o 示例端口2222配置在127.0.0.1
/usr/sbin/sshd -p 2222 -D -e -o ListenAddress=127.0.0.1

ssh密钥远程登录 示例id_ed25519_server密钥连接开启在端口2222配置在127.0.0.1的sshd
ssh -i id_ed25519_server -p 2222 root@127.0.0.1
