package com.yxf.backstage;

import com.yxf.backstage.plugins.google.GoogleTranslate;

public class GoogleTranslateTest {

	public static void main(String[] args) {
		System.out.println("-----test-----");
		String txt="永和九年，岁在癸丑，暮春之初，会于会稽山阴之兰亭，修禊事也。群贤毕至，少长咸集。此地有崇山峻岭，茂林修竹；又有清流激湍，映带左右，引以为流觞曲水，列坐其次。虽无丝竹管弦之盛，一觞一咏，亦足以畅叙幽情。是日也，天朗气清，惠风和畅，仰观宇宙之大，俯察品类之盛，所以游目骋怀，足以极视听之娱，信可乐也。\n" +
				"夫人之相与，俯仰一世，或取诸怀抱，悟言一室之内；或因寄所托，放浪形骸之外。虽趣舍万殊，静躁不同，当其欣于所遇，暂得于己，快然自足，不知老之将至。及其所之既倦，情随事迁，感慨系之矣。向之所欣，俯仰之间，已为陈迹，犹不能不以之兴怀。况修短随化，终期于尽。古人云：“死生亦大矣。”岂不痛哉！(不知老之将至 一作：曾不知老之将至)\n" +
				"每览昔人兴感之由，若合一契，未尝不临文嗟悼，不能喻之于怀。固知一死生为虚诞，齐彭殇为妄作。后之视今，亦犹今之视昔。悲夫！故列叙时人，录其所述，虽世殊事异，所以兴怀，其致一也。后之览者，亦将有感于斯文。";
		GoogleTranslate g = GoogleTranslate.getInstance();
//		String text = "Who can say that support does not support";
		try {
			System.out.println("====================中文转英语=======================");
			System.out.println( g.translateText(txt,"auto","en"));
			System.out.println("====================中文转日语=======================");
			System.out.println( g.translateText(txt,"auto","ja"));
			System.out.println("====================中文转俄语=======================");
			System.out.println( g.translateText(txt,"auto","ru"));
			System.out.println("====================中文转西班牙语=======================");
			System.out.println( g.translateText(txt,"auto","es"));
			System.out.println("====================中文转繁体=======================");
			System.out.println( g.translateText(txt,"auto","zh_tw"));
			System.out.println("====================中文转韩语=======================");
			System.out.println( g.translateText(txt,"auto","ko"));
			System.out.println("====================中文转德语=======================");
			System.out.println( g.translateText(txt,"auto","de"));
//			System.out.println("====================英语转中文=======================");
//			//System.out.println( g.translateText("谁能说支持不支持","auto","en"));
//			System.out.println( g.translateText(text,"auto","zh_cn"));
//			System.out.println("====================英语转台湾中文=======================");
//			System.out.println( g.translateText(text,"auto","zh_tw"));
//			System.out.println("====================英语转日文=======================");
//			System.out.println( g.translateText(text,"auto","ja"));
//			System.out.println("====================英语转中法文=======================");
//			System.out.println( g.translateText(text,"auto","ru"));
//			System.out.println("====================英语转西班牙文=======================");
//			System.out.println( g.translateText(text,"auto","es"));
//			System.out.println("====================英语转韩文=======================");
//			System.out.println( g.translateText(text,"auto","ko"));
//			System.out.println("====================英语转德文=======================");
//			System.out.println( g.translateText(text,"auto","de"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
