clear
echo -n "WEI服务执行... "
for i in {1..10}; do
    for char in '/' '-' '\\' '|'; do
        printf "\b$char"
        sleep 0.1
    done
done
printf "\b 启动！\n"
sleep 0.1
for ((i=0; i<=100; i+=1)); do
    printf "\r\033[K从仓库提取中：%d%%" "$i"
    sleep 0.1
done
printf "\n"
sleep 0.3
printf "开始编译构建"
sleep 0.2
printf "."
sleep 0.2
printf "."
sleep 0.2
printf "."
sleep 0.1
clear
printf "#include <reg51.h>\n"
sleep 0.1
printf "sbit key = P3^0;\n"
sleep 0.1
printf "void delay(unsigned int ms)\n"
sleep 0.1
printf "{\n"
sleep 0.1
printf "    unsigned int i;\n"
sleep 0.1
printf "    for(i=0;i<ms;i++);\n"
sleep 0.1
printf "}\n"
sleep 0.1
printf "void main()\n"
sleep 0.1
printf "{\n"
sleep 0.1
printf "    unsigned int i,w;\n"
sleep 0.1
printf "    unsigned char keynum = 0;\n"
sleep 0.1
printf "    while(1)\n"
sleep 0.1
printf "    {\n"
sleep 0.1
printf "        if(!key)\n"
sleep 0.1
printf "        {\n"
sleep 0.1
printf "            delay(10);\n"
sleep 0.1
printf "            while(!key);\n"
sleep 0.1
printf "            keynum++;\n"
sleep 0.1
printf "        }\n"
sleep 0.1
printf "        if(keynum == 6)keynum = 1;\n"
sleep 0.1
printf "        switch(keynum)\n"
sleep 0.1
printf "        {\n"
sleep 0.1
printf "            case 1:\n"
sleep 0.1
printf "                w=0x01;\n"
sleep 0.1
printf "            for(i=0;i<8;i++)\n"
sleep 0.1
printf "            {\n"
sleep 0.1
printf "                P1=~w;\n"
sleep 0.1
printf "                delay(500);\n"
sleep 0.1
printf "                w<<=1;\n"
sleep 0.1
printf "            }   break;\n"
sleep 0.1
printf "            case 2:\n"
sleep 0.1
printf "                w=0x80;\n"
sleep 0.1
printf "            for(i=0;i<8;i++)\n"
sleep 0.1
printf "            {\n"
sleep 0.1
printf "                P1=~w;\n"
sleep 0.1
printf "                delay(500);\n"
sleep 0.1
printf "                w>>=1;\n"
sleep 0.1
printf "            }   break;\n"
sleep 0.1
printf "            case 3:\n"
sleep 0.1
printf "            for(i=0;i<5;i++)\n"
sleep 0.1
printf "            {\n"
sleep 0.1
printf "                P1=0x00;\n"
sleep 0.1
printf "                delay(200);\n"
sleep 0.1
printf "                P1=0xff;\n"
sleep 0.1
printf "                delay(200);\n"
sleep 0.1
printf "            }   break;\n"
sleep 0.1
printf "            case 4:\n"
sleep 0.1
printf "                w=0x18;\n"
sleep 0.1
printf "            for(i=0;i<4;i++)\n"
sleep 0.1
printf "            {\n"
sleep 0.1
printf "                P1=~w;\n"
sleep 0.1
printf "                delay(500);\n"
sleep 0.1
printf "                w|=(w>>1)|(w<<1);\n"
sleep 0.1
printf "                w&=0xff;\n"
sleep 0.1
printf "            }   break;\n"
sleep 0.1
printf "            default: P1 = 0xff;\n"
sleep 0.1
printf "        }\n"
sleep 0.1
printf "    }\n"
sleep 0.1
printf "}\n"
printf "\n"
