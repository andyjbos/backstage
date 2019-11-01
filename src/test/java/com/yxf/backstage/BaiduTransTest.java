package com.yxf.backstage;

import com.yxf.backstage.plugins.baidu.TransApi;

/**
 * auto	自动检测</br>
 * zh	中文</br>
 * en	英语</br>
 * yue	粤语</br>
 * wyw	文言文</br>
 * jp	日语</br>
 * kor	韩语</br>
 * fra	法语</br>
 * spa	西班牙语</br>
 * th	泰语</br>
 * ara	阿拉伯语</br>
 * ru	俄语</br>
 * pt	葡萄牙语</br>
 * de	德语</br>
 * it	意大利语</br>
 * el	希腊语</br>
 * nl	荷兰语</br>
 * pl	波兰语</br>
 * bul	保加利亚语</br>
 * est	爱沙尼亚语</br>
 * dan	丹麦语</br>
 * fin	芬兰语</br>
 * cs	捷克语</br>
 * rom	罗马尼亚语</br>
 * slo	斯洛文尼亚语</br>
 * swe	瑞典语</br>
 * hu	匈牙利语</br>
 * cht	繁体中文</br>
 * vie	越南语</br>
 * @author win
 */
public class BaiduTransTest {

	// 在平台申请的APP_ID 详见 http://api.fanyi.baidu.com/api/trans/product/desktop?req=developer
	 private static final String APP_ID = "20191030000349230";
	 private static final String SECURITY_KEY = "fAwEZUjRMH4XiI_dhot2";
	 String txt="永和九年，岁在癸丑，暮春之初，会于会稽山阴之兰亭，修禊事也。群贤毕至，少长咸集。此地有崇山峻岭，茂林修竹；又有清流激湍，映带左右，引以为流觞曲水，列坐其次。虽无丝竹管弦之盛，一觞一咏，亦足以畅叙幽情。是日也，天朗气清，惠风和畅，仰观宇宙之大，俯察品类之盛，所以游目骋怀，足以极视听之娱，信可乐也。\n" +
				"夫人之相与，俯仰一世，或取诸怀抱，悟言一室之内；或因寄所托，放浪形骸之外。虽趣舍万殊，静躁不同，当其欣于所遇，暂得于己，快然自足，不知老之将至。及其所之既倦，情随事迁，感慨系之矣。向之所欣，俯仰之间，已为陈迹，犹不能不以之兴怀。况修短随化，终期于尽。古人云：“死生亦大矣。”岂不痛哉！(不知老之将至 一作：曾不知老之将至)\n" +
				"每览昔人兴感之由，若合一契，未尝不临文嗟悼，不能喻之于怀。固知一死生为虚诞，齐彭殇为妄作。后之视今，亦犹今之视昔。悲夫！故列叙时人，录其所述，虽世殊事异，所以兴怀，其致一也。后之览者，亦将有感于斯文。";
	 static String query="永和九年，岁在癸丑，暮春之初，会于会稽山阴之兰亭，修禊事也。";
	 public static void main(String[] args) {
	     TransApi api = new TransApi(APP_ID, SECURITY_KEY);
	     //String query = "百度翻译测试案例！";
	     System.out.println(api.getTransResult(query, "auto", "en"));
	 }

}
