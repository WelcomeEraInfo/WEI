echo "请选择要执行的操作："
echo "1) 查看今天吃什么（吃饭菜单）"
echo "2) ping bing.com"
read -p "请输入数字 (1 或 2): " choice

case $choice in
    1)
        echo -e "\n🍽️ 今日吃饭菜单："
        echo "1. 番茄炒青椒"
        echo "2. 番茄炒鸡蛋"
        echo "3. 番茄炒沙拉"
        echo "4. 番茄炒米饭"
        ;;
    2)
        echo -e "\n🌐 正在 ping bing.com ..."
        ping -c 3 bing.com
        ;;
    *)
        echo "❌ 无效选项，请输入 1 或 2"
        ;;
esac
