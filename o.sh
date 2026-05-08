echo -n "WEI服务执行... "
for i in {1..10}; do
    for char in '/' '-' '\\' '|'; do
        printf "\b$char"
        sleep 0.1
    done
done
printf "\b 启动！\n"
printf "#include <reg51.h>\n"
printf "sbit key = P3^0;\n"
