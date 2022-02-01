package com.pnc;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CollectionsSlide47 {

	static String mobyDick = "The Project Gutenberg eBook of Moby-Dick; or The Whale, by Herman Melville\r\n" + "\r\n"
			+ "This eBook is for the use of anyone anywhere in the United States and\r\n"
			+ "most other parts of the world at no cost and with almost no restrictions\r\n"
			+ "whatsoever. You may copy it, give it away or re-use it under the terms\r\n"
			+ "of the Project Gutenberg License included with this eBook or online at\r\n"
			+ "www.gutenberg.org. If you are not located in the United States, you\r\n"
			+ "will have to check the laws of the country where you are located before\r\n" + "using this eBook.\r\n"
			+ "\r\n" + "Title: Moby-Dick; or The Whale\r\n" + "\r\n" + "Author: Herman Melville\r\n" + "\r\n"
			+ "Release Date: June, 2001 [eBook #2701]\r\n" + "[Most recently updated: August 18, 2021]\r\n" + "\r\n"
			+ "Language: English\r\n" + "\r\n" + "Character set encoding: UTF-8\r\n" + "\r\n"
			+ "Produced by: Daniel Lazarus, Jonesey, and David Widger\r\n" + "\r\n"
			+ "*** START OF THE PROJECT GUTENBERG EBOOK MOBY-DICK; OR THE WHALE ***\r\n" + "\r\n" + "\r\n" + "\r\n"
			+ "\r\n" + "MOBY-DICK;\r\n" + "\r\n" + "or, THE WHALE.\r\n" + "\r\n" + "By Herman Melville\r\n" + "\r\n"
			+ "\r\n" + "\r\n" + "CONTENTS\r\n" + "\r\n" + "ETYMOLOGY.\r\n" + "\r\n"
			+ "EXTRACTS (Supplied by a Sub-Sub-Librarian).\r\n" + "\r\n" + "CHAPTER 1. Loomings.\r\n" + "\r\n"
			+ "CHAPTER 2. The Carpet-Bag.\r\n" + "\r\n" + "CHAPTER 3. The Spouter-Inn.\r\n" + "\r\n"
			+ "CHAPTER 4. The Counterpane.\r\n" + "\r\n" + "CHAPTER 5. Breakfast.\r\n" + "\r\n"
			+ "CHAPTER 6. The Street.\r\n" + "\r\n" + "CHAPTER 7. The Chapel.\r\n" + "\r\n"
			+ "CHAPTER 8. The Pulpit.\r\n" + "\r\n" + "CHAPTER 9. The Sermon.\r\n" + "\r\n"
			+ "CHAPTER 10. A Bosom Friend.\r\n" + "\r\n" + "CHAPTER 11. Nightgown.\r\n" + "\r\n"
			+ "CHAPTER 12. Biographical.\r\n" + "\r\n" + "CHAPTER 13. Wheelbarrow.\r\n" + "\r\n"
			+ "CHAPTER 14. Nantucket.\r\n" + "\r\n" + "CHAPTER 15. Chowder.\r\n" + "\r\n" + "CHAPTER 16. The Ship.\r\n"
			+ "\r\n" + "CHAPTER 17. The Ramadan.\r\n" + "\r\n" + "CHAPTER 18. His Mark.\r\n" + "\r\n"
			+ "CHAPTER 19. The Prophet.\r\n" + "\r\n" + "CHAPTER 20. All Astir.\r\n" + "\r\n"
			+ "CHAPTER 21. Going Aboard.\r\n" + "\r\n" + "CHAPTER 22. Merry Christmas.\r\n" + "\r\n"
			+ "CHAPTER 23. The Lee Shore.\r\n" + "\r\n" + "CHAPTER 24. The Advocate.\r\n" + "\r\n"
			+ "CHAPTER 25. Postscript.\r\n" + "\r\n" + "CHAPTER 26. Knights and Squires.\r\n" + "\r\n"
			+ "CHAPTER 27. Knights and Squires.\r\n" + "\r\n" + "CHAPTER 28. Ahab.\r\n" + "\r\n"
			+ "CHAPTER 29. Enter Ahab; to Him, Stubb.\r\n" + "\r\n" + "CHAPTER 30. The Pipe.\r\n" + "\r\n"
			+ "CHAPTER 31. Queen Mab.\r\n" + "\r\n" + "CHAPTER 32. Cetology.\r\n" + "\r\n"
			+ "CHAPTER 33. The Specksnyder.\r\n" + "\r\n" + "CHAPTER 34. The Cabin-Table.\r\n" + "\r\n"
			+ "CHAPTER 35. The Mast-Head.\r\n" + "\r\n" + "CHAPTER 36. The Quarter-Deck.\r\n" + "\r\n"
			+ "CHAPTER 37. Sunset.\r\n" + "\r\n" + "CHAPTER 38. Dusk.\r\n" + "\r\n"
			+ "CHAPTER 39. First Night-Watch.\r\n" + "\r\n" + "CHAPTER 40. Midnight, Forecastle.\r\n" + "\r\n"
			+ "CHAPTER 41. Moby Dick.\r\n" + "\r\n" + "CHAPTER 42. The Whiteness of the Whale.\r\n" + "\r\n"
			+ "CHAPTER 43. Hark!\r\n" + "\r\n" + "CHAPTER 44. The Chart.\r\n" + "\r\n"
			+ "CHAPTER 45. The Affidavit.\r\n" + "\r\n" + "CHAPTER 46. Surmises.\r\n" + "\r\n"
			+ "CHAPTER 47. The Mat-Maker.\r\n" + "\r\n" + "CHAPTER 48. The First Lowering.\r\n" + "\r\n"
			+ "CHAPTER 49. The Hyena.\r\n" + "\r\n" + "CHAPTER 50. Ahab’s Boat and Crew. Fedallah.\r\n" + "\r\n"
			+ "CHAPTER 51. The Spirit-Spout.\r\n" + "\r\n" + "CHAPTER 52. The Albatross.\r\n" + "\r\n"
			+ "CHAPTER 53. The Gam.\r\n" + "\r\n" + "CHAPTER 54. The Town-Ho’s Story.\r\n" + "\r\n"
			+ "CHAPTER 55. Of the Monstrous Pictures of Whales.\r\n" + "\r\n"
			+ "CHAPTER 56. Of the Less Erroneous Pictures of Whales, and the True\r\n"
			+ "Pictures of Whaling Scenes.\r\n" + "\r\n"
			+ "CHAPTER 57. Of Whales in Paint; in Teeth; in Wood; in Sheet-Iron; in\r\n"
			+ "Stone; in Mountains; in Stars.\r\n" + "\r\n" + "CHAPTER 58. Brit.\r\n" + "\r\n"
			+ "CHAPTER 59. Squid.\r\n" + "\r\n" + "CHAPTER 60. The Line.\r\n" + "\r\n"
			+ "CHAPTER 61. Stubb Kills a Whale.\r\n" + "\r\n" + "CHAPTER 62. The Dart.\r\n" + "\r\n"
			+ "CHAPTER 63. The Crotch.\r\n" + "\r\n" + "CHAPTER 64. Stubb’s Supper.\r\n" + "\r\n"
			+ "CHAPTER 65. The Whale as a Dish.\r\n" + "\r\n" + "CHAPTER 66. The Shark Massacre.\r\n" + "\r\n"
			+ "CHAPTER 67. Cutting In.\r\n" + "\r\n" + "CHAPTER 68. The Blanket.\r\n" + "\r\n"
			+ "CHAPTER 69. The Funeral.\r\n" + "\r\n" + "CHAPTER 70. The Sphynx.\r\n" + "\r\n"
			+ "CHAPTER 71. The Jeroboam’s Story.\r\n" + "\r\n" + "CHAPTER 72. The Monkey-Rope.\r\n" + "\r\n"
			+ "CHAPTER 73. Stubb and Flask kill a Right Whale; and Then Have a Talk\r\n" + "over Him.\r\n" + "\r\n"
			+ "CHAPTER 74. The Sperm Whale’s Head—Contrasted View.\r\n" + "\r\n"
			+ "CHAPTER 75. The Right Whale’s Head—Contrasted View.\r\n" + "\r\n" + "CHAPTER 76. The Battering-Ram.\r\n"
			+ "\r\n" + "CHAPTER 77. The Great Heidelburgh Tun.\r\n" + "\r\n" + "CHAPTER 78. Cistern and Buckets.\r\n"
			+ "\r\n" + "CHAPTER 79. The Prairie.\r\n" + "\r\n" + "CHAPTER 80. The Nut.\r\n" + "\r\n"
			+ "CHAPTER 81. The Pequod Meets The Virgin.\r\n" + "\r\n"
			+ "CHAPTER 82. The Honor and Glory of Whaling.\r\n" + "\r\n"
			+ "CHAPTER 83. Jonah Historically Regarded.\r\n" + "\r\n" + "CHAPTER 84. Pitchpoling.\r\n" + "\r\n"
			+ "CHAPTER 85. The Fountain.\r\n" + "\r\n" + "CHAPTER 86. The Tail.\r\n" + "\r\n"
			+ "CHAPTER 87. The Grand Armada.\r\n" + "\r\n" + "CHAPTER 88. Schools and Schoolmasters.\r\n" + "\r\n"
			+ "CHAPTER 89. Fast-Fish and Loose-Fish.\r\n" + "\r\n" + "CHAPTER 90. Heads or Tails.\r\n" + "\r\n"
			+ "CHAPTER 91. The Pequod Meets The Rose-Bud.\r\n" + "\r\n" + "CHAPTER 92. Ambergris.\r\n" + "\r\n"
			+ "CHAPTER 93. The Castaway.\r\n" + "\r\n" + "CHAPTER 94. A Squeeze of the Hand.\r\n" + "\r\n"
			+ "CHAPTER 95. The Cassock.\r\n" + "\r\n" + "CHAPTER 96. The Try-Works.\r\n" + "\r\n"
			+ "CHAPTER 97. The Lamp.\r\n" + "\r\n" + "CHAPTER 98. Stowing Down and Clearing Up.\r\n" + "\r\n"
			+ "CHAPTER 99. The Doubloon.\r\n" + "\r\n" + "CHAPTER 100. Leg and Arm.\r\n" + "\r\n"
			+ "CHAPTER 101. The Decanter.\r\n" + "\r\n" + "CHAPTER 102. A Bower in the Arsacides.\r\n" + "\r\n"
			+ "CHAPTER 103. Measurement of The Whale’s Skeleton.\r\n" + "\r\n" + "CHAPTER 104. The Fossil Whale.\r\n"
			+ "\r\n" + "CHAPTER 105. Does the Whale’s Magnitude Diminish?—Will He Perish?\r\n" + "\r\n"
			+ "CHAPTER 106. Ahab’s Leg.\r\n" + "\r\n" + "CHAPTER 107. The Carpenter.\r\n" + "\r\n"
			+ "CHAPTER 108. Ahab and the Carpenter.\r\n" + "\r\n" + "CHAPTER 109. Ahab and Starbuck in the Cabin.\r\n"
			+ "\r\n" + "CHAPTER 110. Queequeg in His Coffin.\r\n" + "\r\n" + "CHAPTER 111. The Pacific.\r\n" + "\r\n"
			+ "CHAPTER 112. The Blacksmith.\r\n" + "\r\n" + "CHAPTER 113. The Forge.\r\n" + "\r\n"
			+ "CHAPTER 114. The Gilder.\r\n" + "\r\n" + "CHAPTER 115. The Pequod Meets The Bachelor.\r\n" + "\r\n"
			+ "CHAPTER 116. The Dying Whale.\r\n" + "\r\n" + "CHAPTER 117. The Whale Watch.\r\n" + "\r\n"
			+ "CHAPTER 118. The Quadrant.\r\n" + "\r\n" + "CHAPTER 119. The Candles.\r\n" + "\r\n"
			+ "CHAPTER 120. The Deck Towards the End of the First Night Watch.\r\n" + "\r\n"
			+ "CHAPTER 121. Midnight.—The Forecastle Bulwarks.\r\n" + "\r\n"
			+ "CHAPTER 122. Midnight Aloft.—Thunder and Lightning.\r\n" + "\r\n" + "CHAPTER 123. The Musket.\r\n"
			+ "\r\n" + "CHAPTER 124. The Needle.\r\n" + "\r\n" + "CHAPTER 125. The Log and Line.\r\n" + "\r\n"
			+ "CHAPTER 126. The Life-Buoy.\r\n" + "\r\n" + "CHAPTER 127. The Deck.\r\n" + "\r\n"
			+ "CHAPTER 128. The Pequod Meets The Rachel.\r\n" + "\r\n" + "CHAPTER 129. The Cabin.\r\n" + "\r\n"
			+ "CHAPTER 130. The Hat.\r\n" + "\r\n" + "CHAPTER 131. The Pequod Meets The Delight.\r\n" + "\r\n"
			+ "CHAPTER 132. The Symphony.\r\n" + "\r\n" + "CHAPTER 133. The Chase—First Day.\r\n" + "\r\n"
			+ "CHAPTER 134. The Chase—Second Day.\r\n" + "\r\n" + "CHAPTER 135. The Chase.—Third Day.\r\n" + "\r\n"
			+ "Epilogue\r\n" + "\r\n" + "\r\n" + "\r\n" + "\r\n" + "Original Transcriber’s Notes:\r\n" + "\r\n" + "\r\n"
			+ "\r\n" + "\r\n" + "\r\n" + "This text is a combination of etexts, one from the now-defunct ERIS\r\n"
			+ "project at Virginia Tech and one from Project Gutenberg’s archives. The\r\n"
			+ "proofreaders of this version are indebted to The University of Adelaide\r\n"
			+ "Library for preserving the Virginia Tech version. The resulting etext\r\n"
			+ "was compared with a public domain hard copy version of the text.\r\n";

	public static void main(String[] args) {

		// HashMap<String, Integer> words = new HashMap<String, Integer>(); //declare
		// maps
		TreeMap<String, Integer> words = new TreeMap<String, Integer>();

		for (String word : mobyDick.toLowerCase().split("\\P{Alpha}+")) { // to lower case & spit by alpha numerics
			if (!words.containsKey(word)) {
				words.put(word, 1); // if there is one word
			} else {
				int count = words.get(word); // count words
				count++;
				words.put(word, count);
			}
		}

		words.forEach((key, value) -> System.out.println(key + "\t" + "\t" + "\t" + value));

	}
}