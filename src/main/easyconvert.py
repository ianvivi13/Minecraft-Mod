import re

inputString = '''   public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_SILVER_ORE = registerKey("add_overworld_silver_ore");'''
wordToSearch = "SILVER"
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
