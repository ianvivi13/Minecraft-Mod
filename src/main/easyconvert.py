import re

inputString = '''   "block.lot_o_everything.magnesium_block": "Block of Magnesium",
  "block.lot_o_everything.magnesium_ore": "Magnesium Ore",
  "block.lot_o_everything.deepslate_magnesium_ore": "Deepslate Magnesium Ore",'''
wordToSearch = "MAGNESIUM"
replaceWith = ["RUBY", "SAPPHIRE"]

for word in replaceWith:
    newString = inputString
    for i in range(0, inputString.lower().count(wordToSearch.lower())):
        newCaseWord = ""
        wordToSearchWithCase = re.search(wordToSearch, newString, flags=re.I).group(0)
        if wordToSearchWithCase[0].islower():
            newCaseWord = word.lower()
        else:
            if len(wordToSearchWithCase) > 1 and wordToSearchWithCase[1].islower():
                newCaseWord = word[0].upper() + word[1:].lower()
            else:
                newCaseWord = word.upper()
        newString = newString.replace(wordToSearchWithCase, newCaseWord, 1)
    print(newString)
print("\n")
