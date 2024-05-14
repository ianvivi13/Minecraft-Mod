import re

inputString = '''   oreSmelting(pRecipeOutput, List.of(ModBlocks.RAW_SILVER_BLOCK.get()), RecipeCategory.MISC, ModBlocks.SILVER_BLOCK.get(), 0.7F * 9, 200, "silver_block");
        oreBlasting(pRecipeOutput, List.of(ModBlocks.RAW_SILVER_BLOCK.get()), RecipeCategory.MISC, ModBlocks.SILVER_BLOCK.get(), 0.7F * 9, 100, "silver_block");
        '''
wordToSearch = "SILVER"
replaceWith = ["LEAD", "TITANIUM", "TIN", "ZINC", "MAGNESIUM"]

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
