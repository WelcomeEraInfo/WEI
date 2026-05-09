clear
echo -n "WEI服务执行... "
for i in {1..10}; do
    for char in '/' '-' '\\' '|'; do
        printf "\b$char"
        sleep 0.1
    done
done
printf "\b 启动！\n"
for ((i=0; i<=100; i+=1)); do
    clear_line
    echo -ne "提取：$i%"
    sleep 0.1
done
printf "\n"
sleep 0.5
printf "构建"
sleep 0.1
printf "."
sleep 0.1
printf "."
sleep 0.1
printf "."
sleep 0.1
clear
printf "#include <reg51.h>\n"
sleep 0.1
printf "sbit key = P3^0;\n"
sleep 0.1
printf "void delay"
sleep 0.1
printf "\n"
