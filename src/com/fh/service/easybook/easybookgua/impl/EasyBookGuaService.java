package com.fh.service.easybook.easybookgua.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONArray;
import com.fh.dao.DaoSupport;
import com.fh.entity.Page;
import com.fh.service.easybook.easybookgua.EasyBookGuaManager;
import com.fh.util.PageData;

/** 
 * 说明： 挂
 * 创建人：Silence13161618211
 * 创建时间：2018-06-16
 * @version
 */
@Service("easybookguaService")
public class EasyBookGuaService implements EasyBookGuaManager{

	@Resource(name = "daoSupport")
	private DaoSupport dao;
	
	/**新增
	 * @param pd
	 * @throws Exception
	 */
	public void save(PageData pd)throws Exception{
		dao.save("EasyBookGuaMapper.save", pd);
	}
	
	/**删除
	 * @param pd
	 * @throws Exception
	 */
	public void delete(PageData pd)throws Exception{
		dao.delete("EasyBookGuaMapper.delete", pd);
	}
	
	/**修改
	 * @param pd
	 * @throws Exception
	 */
	public void edit(PageData pd)throws Exception{
		dao.update("EasyBookGuaMapper.edit", pd);
	}
	
	/**列表
	 * @param page
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> list(Page page)throws Exception{
		return (List<PageData>)dao.findForList("EasyBookGuaMapper.datalistPage", page);
	}
	
	/**列表(全部)
	 * @param pd
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> listAll(PageData pd)throws Exception{
		return (List<PageData>)dao.findForList("EasyBookGuaMapper.listAll", pd);
	}
	
	/**通过id获取数据
	 * @param pd
	 * @throws Exception
	 */
	public PageData findById(PageData pd)throws Exception{
		return (PageData)dao.findForObject("EasyBookGuaMapper.findById", pd);
	}
	/**通过gua_code获取数据
	 * @param pd
	 * @throws Exception
	 */
	public PageData findByCode(PageData pd)throws Exception{
		return (PageData)dao.findForObject("EasyBookGuaMapper.findByCode", pd);
	}
	/**批量删除
	 * @param ArrayDATA_IDS
	 * @throws Exception
	 */
	public void deleteAll(String[] ArrayDATA_IDS)throws Exception{
		dao.delete("EasyBookGuaMapper.deleteAll", ArrayDATA_IDS);
	}


	/**
	 * 金钱起卦法取三枚相同的钱币合于双手中，上下摇动数下使钱币翻滚摩擦，再随意抛撒钱币到桌面或平盘等硬物上， 这时会出现四种情况：
	 * 1.三枚铜钱中有两枚正面向上，这是少阳之象，记做“”，为阳爻；
	 */
	public static final int yang = 2;

	/**
	 * 2. 三枚铜钱中只有一枚正面向上，这是少阴之象，记做“”，为阴爻；
	 */
	public static final int ying = 1;

	/**
	 * 3. 三枚铜钱都是正面向上，这是老阴之象，记做“X”，为变爻，在主卦中是阴爻，在变卦中是阳爻；
	 */
	public static final int laoying = 3;

	/**
	 * 4. 三枚铜钱都是反面向上，这是老阳之象，记做“O”，为变爻，在主卦中是阳爻，在变卦中是阴爻。
	 */
	public static final int laoyang = 0;

	/**
	 * 如此连续六次就得到了六个爻，可以构成一个完整的卦象。画爻时按从下到上的顺序排列。老阳和老阴被称为“动爻”，意为：变动之爻。动爻变化后得到的卦称为“
	 * 变卦”或“之卦”，而开始摇出的卦称为“主卦”。“主卦”对应所测之事的开始，“变卦”对应所测之事的结局。因为动爻和变卦的存在，卦象变得更复杂。
	 * 
	 * @throws Exception
	 *
	 * 
	 * 
	 */

	public String run() throws Exception {
		JSONArray result = new JSONArray();
		// 设定三个硬币,硬币有正反面,0阴反和1阳正
		int firstCoin = new Random().nextInt(2);
		int secondCoin = new Random().nextInt(2);
		int thirdCoin = new Random().nextInt(2);
		System.out.println("firstCoin:" + firstCoin);
		System.out.println("secondCoin:" + secondCoin);
		System.out.println("thirdCoin:" + thirdCoin);
		// 从下往上,从左到右第一爻
		int firstYao = firstCoin + secondCoin + thirdCoin;

		firstCoin = new Random().nextInt(2);
		secondCoin = new Random().nextInt(2);
		thirdCoin = new Random().nextInt(2);
		System.out.println("firstCoin:" + firstCoin);
		System.out.println("secondCoin:" + secondCoin);
		System.out.println("thirdCoin:" + thirdCoin);
		int secondYao = firstCoin + secondCoin + thirdCoin;

		firstCoin = new Random().nextInt(2);
		secondCoin = new Random().nextInt(2);
		thirdCoin = new Random().nextInt(2);
		System.out.println("firstCoin:" + firstCoin);
		System.out.println("secondCoin:" + secondCoin);
		System.out.println("thirdCoin:" + thirdCoin);
		int thirdYao = firstCoin + secondCoin + thirdCoin;

		firstCoin = new Random().nextInt(2);
		secondCoin = new Random().nextInt(2);
		thirdCoin = new Random().nextInt(2);
		System.out.println("firstCoin:" + firstCoin);
		System.out.println("secondCoin:" + secondCoin);
		System.out.println("thirdCoin:" + thirdCoin);
		int fourYao = firstCoin + secondCoin + thirdCoin;

		firstCoin = new Random().nextInt(2);
		secondCoin = new Random().nextInt(2);
		thirdCoin = new Random().nextInt(2);
		System.out.println("firstCoin:" + firstCoin);
		System.out.println("secondCoin:" + secondCoin);
		System.out.println("thirdCoin:" + thirdCoin);
		int fiveYao = firstCoin + secondCoin + thirdCoin;

		firstCoin = new Random().nextInt(2);
		secondCoin = new Random().nextInt(2);
		thirdCoin = new Random().nextInt(2);
		System.out.println("firstCoin:" + firstCoin);
		System.out.println("secondCoin:" + secondCoin);
		System.out.println("thirdCoin:" + thirdCoin);
		int sixYao = firstCoin + secondCoin + thirdCoin;

		System.out.println("firstYao:" + firstYao);
		System.out.println("secondYao:" + secondYao);
		System.out.println("thirdYao:" + thirdYao);
		System.out.println("fourYao:" + fourYao);
		System.out.println("fiveYao:" + fiveYao);
		System.out.println("sixYao:" + sixYao);
		Map<Integer, Integer> gua = new HashMap<>();
		gua.put(1, firstYao);
		gua.put(2, secondYao);
		gua.put(3, thirdYao);
		gua.put(4, fourYao);
		gua.put(5, fiveYao);
		gua.put(6, sixYao);
		String zhugua = "";
		String biangua = "";
		int situation = 0;
		Map<Integer, Integer> bianYao = new HashMap<>();
		Map<Integer, Integer> buBianYao = new HashMap<>();
		if (firstYao == laoyang) {// 3老阳,在主卦中是阴爻，在变卦中是阳爻；
			situation += 1;
			zhugua += 0;
			biangua += 1;
			bianYao.put(1, laoyang);
		} else if (firstYao == laoying) {// 0老阴,在主卦中是阳爻，在变卦中是阴爻；
			situation += 1;
			zhugua += 1;
			biangua += 0;
			bianYao.put(1, laoying);
		} else if (firstYao == yang) {
			zhugua += 1;
			biangua += 1;
			buBianYao.put(1, 1);
		} else if (firstYao == ying) {
			zhugua += 0;
			biangua += 0;
			buBianYao.put(1, 0);
		}

		if (secondYao == laoyang) {// 3老阳,在主卦中是阴爻，在变卦中是阳爻；
			situation += 1;
			zhugua += 0;
			biangua += 1;
			bianYao.put(2, laoyang);
		} else if (secondYao == laoying) {// 0老阴,在主卦中是阳爻，在变卦中是阴爻；
			situation += 1;
			zhugua += 1;
			biangua += 0;
			bianYao.put(2, laoying);
		} else if (secondYao == yang) {
			zhugua += 1;
			biangua += 1;
			buBianYao.put(2, 1);
		} else if (secondYao == ying) {
			zhugua += 0;
			biangua += 0;
			buBianYao.put(2, 0);
		}

		if (thirdYao == laoyang) {// 3老阳,在主卦中是阴爻，在变卦中是阳爻；
			situation += 1;
			zhugua += 0;
			biangua += 1;
			bianYao.put(3, laoyang);
		} else if (thirdYao == laoying) {// 0老阴,在主卦中是阳爻，在变卦中是阴爻；
			situation += 1;
			zhugua += 1;
			biangua += 0;
			
			bianYao.put(3, laoying);
		} else if (thirdYao == yang) {
			zhugua += 1;
			biangua += 1;
			buBianYao.put(3, 1);
		} else if (thirdYao == ying) {
			zhugua += 0;
			biangua += 0;
			buBianYao.put(3, 0);
		}

		if (fourYao == laoyang) {// 3老阳,在主卦中是阴爻，在变卦中是阳爻；
			situation += 1;
			zhugua += 0;
			biangua += 1;
			bianYao.put(4, laoyang);
		} else if (fourYao == laoying) {// 0老阴,在主卦中是阳爻，在变卦中是阴爻；
			situation += 1;
			zhugua += 1;
			biangua += 0;
			bianYao.put(4, laoying);
		} else if (fourYao == yang) {
			zhugua += 1;
			biangua += 1;
			buBianYao.put(4, 1);
		} else if (fourYao == ying) {
			zhugua += 0;
			biangua += 0;
			buBianYao.put(4, 0);
		}
		if (fiveYao == laoyang) {// 3老阳,在主卦中是阴爻，在变卦中是阳爻；
			situation += 1;
			zhugua += 0;
			biangua += 1;
			bianYao.put(5, laoyang);
		} else if (fiveYao == laoying) {// 0老阴,在主卦中是阳爻，在变卦中是阴爻；
			situation += 1;
			zhugua += 1;
			biangua += 0;
			bianYao.put(5, laoying);
		} else if (fiveYao == yang) {
			zhugua += 1;
			biangua += 1;
			buBianYao.put(5, 1);
		} else if (fiveYao == ying) {
			zhugua += 0;
			biangua += 0;
			buBianYao.put(5, 0);
		}
		if (sixYao == laoyang) {// 3老阳,在主卦中是阴爻，在变卦中是阳爻；
			situation += 1;
			zhugua += 0;
			biangua += 1;
			bianYao.put(6, laoyang);
		} else if (sixYao == laoying) {// 0老阴,在主卦中是阳爻，在变卦中是阴爻；
			situation += 1;
			zhugua += 1;
			biangua += 0;
			bianYao.put(6, laoying);
		} else if (sixYao == yang) {
			zhugua += 1;
			biangua += 1;
			buBianYao.put(6, 1);
		} else if (sixYao == ying) {
			zhugua += 0;
			biangua += 0;
			buBianYao.put(6, 0);
		}
		
		PageData param = new PageData();
		param.put("gua_code", zhugua);
		PageData zhuguaResult = findByCode(param);
		param.put("gua_code", biangua);
		PageData bianguaResult =findByCode(param);
		System.out.println(zhuguaResult.getString("NAME")+":"+zhuguaResult.getString("TITLE"));
		System.out.println(bianguaResult.getString("NAME")+":"+bianguaResult.getString("TITLE"));
		result.add("主卦:"+zhuguaResult.getString("NAME")+":"+zhuguaResult.getString("TITLE"));
		result.add("变卦:"+bianguaResult.getString("NAME")+":"+bianguaResult.getString("TITLE"));
		
		if (situation == 0) {
			result.add("六爻不变：卦中六个爻都不是变爻，这叫“静卦”，用本卦的卦辞解卦");
		} else if (situation == 1) {
			for (Map.Entry<Integer, Integer> entry : bianYao.entrySet()) {
				result.add("一个爻变：卦中有一个变爻，就用这个变爻的爻辞解卦。第" + entry.getKey() + "爻" + entry.getValue());
			}
		} else if (situation == 2) {
			for (Map.Entry<Integer, Integer> entry : bianYao.entrySet()) {
				result.add("二个爻变：卦中有两个变爻，用这两个变爻的爻辞解卦，以上爻为主。第" + entry.getKey() + "爻" + entry.getValue());
			}
		} else if (situation == 3) {
			for (Map.Entry<Integer, Integer> entry : bianYao.entrySet()) {
				result.add("三个爻变：卦中有三个变爻，用本卦卦辞结合变卦卦辞作综合考虑。第" + entry.getKey() + "爻" + entry.getValue());
			}
		} else if (situation == 4) {
			for (Map.Entry<Integer, Integer> entry : buBianYao.entrySet()) {
				result.add("四个爻变：卦中有四个变爻，用另外两个静爻的爻辞解卦，并以下爻爻辞为主。第" + entry.getKey() + "爻" + entry.getValue());
			}
		} else if (situation == 5) {
			for (Map.Entry<Integer, Integer> entry : buBianYao.entrySet()) {
				result.add("五个爻变：卦中有五个变爻，用变卦的静爻爻辞解卦。第" + entry.getKey() + "爻" + entry.getValue());
			}
		} else if (situation == 6) {
			result.add("六爻皆变：如果是乾、坤两卦就用用九、用六的爻辞解卦，其他卦则用变卦的卦辞解卦。");
		}
		/**
		 * * 根据这种方法得到一个卦后，我们就可以根据下一章中的内容占断吉凶了
		 * 得到一卦后，可以先看此卦卦辞，卦辞是对卦象内容的整体概括。卦辞所提示的哲理带有很大的抽象性、包容性、多维性、启示性，是广义的、多层次的、
		 * 富于变化的。所以不可拘泥于文句的直接含义，呆板地理解。由于《易经》原文晦涩难懂，为了方便读者理解，本书下一章只用白话解读每一卦。
		 * 除了卦辞外，还可以根据爻辞占断吉凶。那么，在不同的卦中用哪一爻的爻辞呢？这里有许多讲 究。 一卦得出后，会有以下七种情况：
		 * 1.六爻不变：卦中六个爻都不是变爻，这叫“静卦”，用本卦的卦辞解卦。 2. 一个爻变：卦中有一个变爻，就用这个变爻的爻辞解卦。
		 * 3.二个爻变：卦中有两个变爻，用这两个变爻的爻辞解卦，以上爻为主。 4. 三个爻变：卦中有三个变爻，用本卦卦辞结合变卦卦辞作综合考虑。
		 * 5.四个爻变：卦中有四个变爻，用另外两个静爻的爻辞解卦，并以下爻爻辞为主。 6. 五个爻变：卦中有五个变爻，用变卦的静爻爻辞解卦。
		 * 7.六爻皆变：如果是乾、坤两卦就用用九、用六的爻辞解卦，其他卦则用变卦的卦辞解卦。
		 */

		String resultStr = "";
		for (Object object : result) {
			resultStr += object.toString() + "\n";
		}
		System.out.println(resultStr);
		return resultStr;
	}

}

