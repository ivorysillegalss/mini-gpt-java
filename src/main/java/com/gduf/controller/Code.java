package com.gduf.controller;

public class Code {
    public static final Integer SYSTEM_ERROR = 100;
    public static final String DEFAULT_PIC = "iVBORw0KGgoAAAANSUhEUgAAAFAAAABRCAYAAABFTSEIAAAAAXNSR0IArs4c6QAAAARnQU1BAACxjwv8YQUAAAAJcEhZcwAAEnQAABJ0Ad5mH3gAABR9SURBVHhe7Z15XFRl28fJNMvKJcV9wQ3TNE3LcskWSzbZ9xlGFllkMwK31LTcc0sry11ywwUFRFwARW2xzPay96msBNG0NDdggBl+73XdM4PDcAZmYICe58Mfv4/DzJlzrvt7ru2+zzmj1TfX1Jj1VQk8T5TCLUfVKBPknlOKuDMlOJpXAiuvU2rYHSuD/fFGmSM7kuuJMlg1wqudrKTebJTpagRYSzUCrKUaAdZSjQBrqUaAtdS/EiD3WMYktX1DqsEBloPJVsH+aDHsDxfCPuMO7A/eIt2EffoNzeuM27A/RJ/xNrSt3XGaAOjtp6HUIADLgR1RClgOqf/AcWsunJeehVvCIXgGboe3+wfwsVsJn3Er4O26Bp4BH8ItLgPOSz6HU+IfcEi5poF6uAj2WaU0m2oYoPUGsAK0A7fgtPk3uLxxEp4hO+E78k3Iu4VD0UaOCa3876q1jETv8b/a9xT0t7xzKPyengvPCVvhOisbTht+ESdBwORjkHdK2VAXqnOADI69w/5IERy358N17knhUXKbSCha+mECi8E9EmCedLDp+wGdJsLHcRXcph8h7/xdhHp9eWQdA2RwSjgk/w23mcfgP2w2FDx49qiaQKtKvM+WfvB/LAGu0zLhuPOS8Mi6BlknAIXBlJcc0m7CZd5H8Bs2SwPO0tCkRMfgVCAbEA+317LhsO9vTY6so7CuA4CacOUc5+W1DgFdQjXeITXYuhRBDKBc6e2wCk7r/iNssudUImlzzWVZgGSgQ0YBXDlcn5gBRbsJZnmdoo3pkvq+pOjkyTisX8+hyk2FRhQZCdtrKMsBPKaCw/5rcI9JhbxPrEng7sKQI6idDCHt/RDa0RcRXXwQ2c0LUT00iuzuRe95I7STr9gm2JqKB33HZJjsjR2C4TFpLxz3XLUoRIsA5PzisPcqhex6CpuJ1cLTB8fA4m1dsXDky3jP6QXsChmNk3OG49tVw/DzxiH4ZcMg/LCqDz6d0wv7Jg7CWpcReOu5F5HwqCvCOvsgsK3MdJDkjZ6KLXDcka/Ni9LjMUe1B0ieZ592A94eaxHQMaRKeLqBBrXzx6Su3pg52BH7wochb2tvlBzvA9WX41Hy60IUXz4M5Y3/QHnnMpT/nEPJ/82FOqcXyo42AbKsoD5ihT+3PoRDsY/izeHjEN3DkzzzrldKHbtcrf1FG+W4/SJV6Np7Yq0AcovAVU7jeVQsqoHHYRrZzRtLnh2Ls0t64056F5SecUVxfiqUt/OhVBZBWVxaWcpCgjgP6uyOwCEr4PA9WlmhKK0pflptjXcdRiO2p4cIb67CVYHkjsAjdJfIibX1whoDFAc+VACP4J2Qd4+oFt7EDn7kLXb4fJ4NCtLbEjh3KP88BmXRbWloBiq+kg31R0MNAN4FWZzeBD+s6CDCm3Nldd7oR7Mfnj42CEA+qF1mMVznnBT9ljF4mgHIRVFI9H0KFza2Q8mxR8mb5kN584IkKEkpS1B8KQPqU48bAagVhfalxIex1f9JvNLHvTw/Stkme3yaaLUaCKCKJv5fwn/oTE2DLCE2nAcwpb8LshL64lbyQ1B9OobCNQ3KwpvSoHQiYCKciwo0HnorF6XfxaAs85GqAWpVfOBefDLbBnOG2Yu0IebYFWyTw+/ZBXDc1gAeyAfklRBvl3epaARXMOyugfyvHNMHjsfpud1RlNocqk9GELx0gnfLCLRiDdhbF6G89h2F7HGUXDqAkovJKP0xAepjXU2Cp1MZhfXnb3QXELnAsE06uwK7BMIzNInarusNAPBYKdzj0iHvFV1F6MqpzXDBZwRPmXov1CcHUmU9ovEqKXgFN6C8TtByd6L023CoTgxA2ZEWBIxgZBA0lhnwykUh/c2STlgx9nm82tdNFJkZg8ZjviwQAbu/hkOOppXRl9SYq5JZALnf40m67/OLoWirMAIvANE2nsimsL2zrxmFXRuU/JEoHbYcqlR9S/7YAvXHI8hrmtccljERRLbj+6Ud8dmcHsjf1BLKjGZYmzIP3rvOUSHJo74wT0wC7DNLJMddlcwDmF0Cj5AksXYn5X0ML4Sq7Z7Qwbie9IAAUvpdLPV0v1aGV0TeeONn8rgoqLOsaVsesAXBVRLv20qE9o3dzbEzYgQihoRTJMVARjMnb/f3MX7jeQHRHE80GSDv1DHpMvxGzauy6q6yG4MLG1pDTeGnzumH4j+zUVRMnqYPj/Md5bnSMx7aUK1LcBVVQu1OSvhARNH0UJMTtWpFDbbjam2DbfqigxkAVXCblgm57WSj3sczglMze1LRaErG0ozh1BMovvoxAdSDx+Kq+k04hXfreoXHNuWub4XXhzqQzZXHENA+CK4zj8M+o8BkLzQ9hKlp9rFfWUXuk2Ob/zD8vYM8SoQLe6AtFY9DKNIvHpQLS35dBfVxm3qGx+LK3E3MvSt4n040V/Z5aTnl+XzLAuSdOX14AX7PzJVc22NjJnX1wteLOovQ1RlcdrgZ5cAoFP91WjNVI88rztsF1anB2pxX37LC98s6iPbKsDfUSTYgAU7rfzZ5nmwiQDXcphyBvK/0MlVA6wAxF83f3FIYWcFo8jIOZQZZ+pWM+rkuBK9JxW3qUXf2N8Nq+2dFsZPyQp4YuM46prmuIsHCUKaF8OFCapzfg4JyhOEBhWjGcfK1XmIGIGW0CFV9SW1TX6K25sSM3mKqJxnGXEzcP4DDniuWA+iYqA1fY8WD+r5v3+qEsoaGY6J+WmWtDeOKYxGiMfqNeIOmeRdglyPNQ18mAXRZ/hX8B083Gr5Ln3sBF9ZTRTUM33Lx+/qS2sZSqv5Yt5LvE0tqxhYb/AdNhdOm8yJ1SfHQV7UA2Y1dF30O2cCpRgHuDhqCf5LuJ+MqGlxGBaU47V7c3NMcf1F1vr7rARSlNIM6gz+XHlxNxcWrKLUZ/qFj8LFu7L4fSjo222C4bRmF8Ye+TyG8s48kwICu4XB+95xJF6GqB0huzJcHZf1ekQQYZO2PE5T/2NiKhlqhkBL22UVdsF0+DCtefB7rXEcgZ3pvXN32IFQWhMgV/drOFjg1uxc2uD+D5S88jy0E6Mz8brhD3lYJIgHMju+Lyb2M5EEap8uC05r7cCSY6MskgOJCUc8oSYB8wedrgqTfvrBKDzbB6bk9xHKWvJVCeKq8VQCCrf2QpHiC+kWe6lkCoGZVOnni44js6i2OwceStVRQoXATNugae/3v8EpNvK2bNEAqJG7TjsLh4B1JJvqqPgcSQM/QXQgwsurMTemPKztUMvDKtoewcNRLZKAE9G5e+JKgqyTCy3xZiaIwa4ijAKd/HP6b3/9jfZtKJ+vLhV3FhSljAD1iU+GQdkuaiZ5MKiKeQTsoL4RJApw2wJkG0F4MRH9Qv6xpi9k0ZTIcFIu95Gh8PxRSPtQfVI101ApH4/oJb5OCwXPen99tVwngV4sJYP8qAE7aB4fUm5I89FVrgFMZ4NuVAZ5//xEx55QCqKD3sqbYakPr7qBqJMpnWfG2iJMAyH/HUIslBfDLRdV4YOR+ywDkKuwRuttoCPNC5Y8rOlQy8Or2B7GMCkflVkGOyb3d8c1bFad9NZeVAPTGU/bCPt2xNP/KMe/pccjd2Epsp/+dswuqBug+OQ0OBywQwqKIxKZREZFegY6kOfBX86mIHNQflKYycnWe9YQjwsQdBf40ffJHbC8PbPV7UlzXrTiomounZ3uCByOOTiZf/eNj8b/TH3PGx7NtqBswKCLU8J+e3UOcfEmANN93m5EpVmWkmOjLJICus45TGxMnCZAvkh+f3BvKZDLSYCbClfgLaiU2ew7HirHPYbXdGGQl2OIf6tEsBU8jK9yhfHr01X54z3E0VtKx1jiNIi/rIi4pVDpWhhUyI20Ra+MhCZDnwy6LP4N9pgXaGJbL4jOQUXcuBZBz3C7vIbieeL+YypUdaiL6rvIVZspRnOjV9JobWH5tOCDeXkWwGbgp4m01vZ3+fjT75mNwOinj4/DxxDY6uzTfU++/B1tcn0JYRyONdLdwjF9zzqSFVZMAOq/4Gv5DZhgFuGj4WJxf3AnFSa1RtL0TinZ2RPHeNlCnSzSxBuI8yI01tyLfL+9okn5c2R5XKAXw6rLhyagoOnHpzVCS3Irs6ixsK056BNffb4UFT42j/Fx5PCyetjptMe2asUkA+cILL+UbW0Ob1MUbpyY4ID9ehtzoSciLjkB+QgBuffAYVGnNtd4orcKUpljrPJK8wVekA1P1/vhR0stn5WJ4TXF7XT9cmuaH3KhJwraLrwThs4kvI6G3wZK+TjRGv9Hz4bg913KLCWI5y2MtFB2CJb2Qq13yy2H4NSwauZExQhcmxeBivAIFW3qgLMO4p1xLaoElY8Ya2a+0eOBcXc+veYT2YRxgQWJ35E+Rkz36dkVjz9gwRHdWSAOkAuLlvUHcbWYxDyyfD9tKz4cDWsuxZFAQzsroLFcwNgbXl49E6f4HxYCkBsqzEZ4r8+0fPCDdoILaBiCknUbBpEB6T/c5h15KxECxSGFsv5yPry8bibyY8HJ7WD+FRGLhY4HkxZpiYTgWhXWguBFe3PEvwcJQpnkgyVG7pK+QWNJnhbUPwGHnMPweURHgX/PHoWRv1UtdP65ojwUjX6Z5sgyhtJ+pPSdgXv8gLB1MejyIBhyE6b0mILwDH0uOGQPH4xzlwar6SPb6vxe8RKEbWQFgqn0YYruw90l4PL3Hd7OO3/CryVfmTAYowthptdHbdgPovfeHh+DbCZEiTDQAo8kLRlXpgUJULT953QaLnx6PNU8H4wsZDzoaF6MoDWj1Pe1306iJmNmf8u3MXiii3FnVPjUeOJo8MEKcSLbn59BoLKZIYY82tF+IxsD3VDsmXTIpfFkmAxT94Iwso2HMmmgdgBS7UG0ujEZ+nAKFG7ujjKulQY9oKL49LW/p48iN90ceeQ0PWl+5kVHIiwvEb4sG487eavpI9kzq9QrW98SlKX64wGmF9pFiF4aYKryP7/XhO87EI2USDKRkugeS+HkP3xcWa3KHhBGcC+cPCMRnshBcjKMq/NYgqLbQYPfSYA+QqrltQ32wKQo22+DKHGeq6BNoH0FC+a8G4vJrnri93haqA/fRtlXBo8/SSclUhbc2FTZcSvDBd0FheLM/5T7KrYZ2C4lLmss0F9ZNWInWySyAdtkqeExK1jxlZMQLFW0USHQai/y3ukCVSGG2jQbD2klKIR0k8SCNgOQmuDS1BZRJ1iikCl6wuSeUOzqiNKUF5TXeRvp7Yn98gvgYSaStGpVtvQfXV1tjzRgnyq88V5b2Pk5NPH0zZQ1QX+YBJPEN2nymuFpJeSFXyVd6ueFIWD/c+IB6QB6IDuJ20h5SKolB6jxSshjQ+xUksY0OGu+L98n75mPojkcq3NgUmRG2mNzTyOoz20ze5zt6gXiI0dxnScwCyLI7oc2FNDc2dnMlz04m27jjWFQfCrtmFSHqXu8m7SOlkQxh6lQBlk7a7fg7nBb2k3TgtF6nO5Zy0734JM4G8X2MrLqwyAn45njXOTlm5T6dzAYolHYTXp7rxEN+Ul7IYogJfV2QHdlHeKJaHyJLN1geuA4mhx97EkNlOJzLWPya32Px5wyNv7ODpNuP3v7LSHfoxH00uSfi+7qSPdI2akJXoWmcd5vWOBuqRgDZC8ev+o7cfj4U7aVDmcUQo7p6IXXCY7i6+kGoPiQP0gHUlz4EFkNlOJw3WfxaF5r62xnuh8Tw/nqnBTLDbTG1nzPZYQQei+z2HzYLTpt+Mzt0daqZB5K4rXFZ8KlYZBA3HBmByKHDc9dt7kPxy4K2KNjQVAxSavC1FYfsxeUtkejypHgOxWjYssheXuN0WfS55hlmiTGaohoDFDpUAPfoFMj6Tjba2rAExLb+mDd0HHKieyN3WSsUbSKQRrzIXBVvboLLqx6ifNcDS0e8iNAOvtXD6zEJHpH7av2sSO0AkviRVo+gHXQ2qbXRGidpNIlDmlduljzzIk7FUpO78mHcXncfShOpfZEAU5U4HXCe+5PAnZnSFatfeFY8T8dtSnXw+AlStpkfEqoNPFatAbIc9l0Tv2kg+kOtkZLGa8UgIzp7i0GnBw/At7M6IX9FS1xf8wBurm1OYd6MvOpelGxpglISe1ghhf4tgn3jg/tx+e2H8cPrHUSr9M6LoxHd3bN6cCyG1y0cXj4b4ZB02aw7UY3JIgD5LDJE8dRSn1jKiRpjJQehFQ+WL7jzJU4GsGzU89jhNRT7FYNwlAoAh+MXU7vi7LSuOB3fA1mRfZEaOBC7/Ybg7efGIKaHpzgRLFPAsThs+XcWHHZfsQg8lkUAskQopN+Ge9R+saJhzrPCDIBB8N0ELIbK1ZOLTzCJX+t/bhI0ncgGjgq+NcU9Itkiz4boy2IAy5VVDNfZOfAds1DkGjF1MhGkRaU9LjfJ/sNfh8vCT0XRsyQ8luUBso6p4Lgtj3LNBsgepRlL+6D6A6k9DkcApxNv5/fgtOV3msdb5vlgQ9UNQJIwNu0GXOd/THPnpeJZDAGSG9u6AMkhrQPXOxq+zy7Q/OgE2VAXv5WgU50B1Ikbboddl8XvKPiMWy56xoBOIXerdW1gar/P++LrNdwYc+pwm3ZE3Glvn2X+k0fmqs4B6iRA7v1LLER40zzaj/ISP28n8qR1YEWgOhmA0km0LDSF5Lk478P/idcoVN+FW/whze/FULhK2VAXqjeAOvE8mh9Y5Mcm3KYchpdsC3zsVgig/IiBvHcM9WoR4gl4LgBCBIr7N4Yl6x8Pvydnie9wjnWLz4DTxvOwy1SKk1QXea4q1TtAfQmYJ+l1ZpF4jIwv4LtNzxQ3M3n5bRJ3y3t5rIWX70Z4hOwUwF2WnhUFin8Hxu6kWrMPiX3XlxoUoJSEFxFUu1MkhsPi1/xeA3hYdfrXAfxvUyPAWqoRYC1l9W/LKf9tIoB116X/r4v/HwIrT2oF6vMnM/9XxPDcT6hhteqcCoGfqOFGf+g+aFTVYodjZu/8pML/A/82MnGLa1YgAAAAAElFTkSuQmCC";

//    pk题目数量
    public static final Integer BRONZE_QUESTION_NUM = 5;
    public static final Integer SILVER_QUESTION_NUM = 7;
    public static final Integer GOLD_QUESTION_NUM = 10;
    public static final Integer PLATINUM_QUESTION_NUM = 13;
    public static final Integer KING_QUESTION_NUM = 15;

//    pk日志格式
    public static final String MATCH_TASK_NAME_PREFIX = "MatchTask -- ";

    //    剧本的状态识别
    public static final Integer SCRIPT_STATUS_OK = 100;
    public static final Integer SCRIPT_STATUS_ERR = 110;
    public static final Integer SCRIPT_STATUS_REPOSITORY = 120;
    public static final Integer SCRIPT_STATUS_OFF = 130;
    public static final Integer SCRIPT_STATUS_CHECKING = 140;

    //    剧本的制作者
    public static final Integer SCRIPT_MADE_OFFICIAL = 100;
    public static final Integer SCRIPT_MADE_PLAYER = 110;

    public static final Integer LOGIN_OK = 200;
    public static final Integer REGISTER_OK = 200;

    public static final Integer LOGIN_ERR = 201;
    public static final Integer REGISTER_ERR = 201;
    public static final Integer REGISTER_REPEAT_NAME = 202;

    public static final Integer SEND_CAPTCHA_OK = 210;
    public static final Integer SEND_CAPTCHA_ERR = 211;

    public static final Integer EMAIL_CODE_SEND_OK = 200;
    public static final Integer EMAIL_CODE_SEND_ERR = 221;

    public static final Integer RESET_PASSWORD_OK = 200;
    public static final Integer RESET_PASSWORD_ERR = 221;

    public static final Integer SCRIPT_READ_OK = 200;
    public static final Integer SCRIPT_READ_ERR = 231;

    public static final Integer SCRIPT_SAVE_OK = 200;
    public static final Integer SCRIPT_SAVE_ERR = 232;

    public static final Integer SCRIPT_NODES_SAVE_OK = 200;
    public static final Integer SCRIPT_NODES_SAVE_ERR = 233;

    public static final Integer SCRIPT_ENDS_SAVE_OK = 200;
    public static final Integer SCRIPT_ENDS_SAVE_ERR = 234;

    public static final Integer PIC_UPLOAD_OK = 200;
    public static final Integer PIC_UPLOAD_ERR = 241;

    public static final Integer UPDATE_MSG_OK = 200;
    public static final Integer UPDATE_MSG_ERR = 241;

    public static final Integer SHOW_MSG_OK = 200;
    public static final Integer SHOW_MSG_ERR = 251;

    public static final Integer UPDATE_PASSWORD_OK = 200;
    public static final Integer UPDATE_PASSWORD_ERR = 251;

    public static final Integer SHOW_QUESTION_OK = 200;
    public static final Integer SHOW_QUESTION_ERR = 261;

    public static final Integer GET_QUESTION_CONDITION_OK = 200;
    public static final Integer GET_QUESTION_CONDITION_ERR = 261;

    public static final Integer SHOW_POST_OK = 200;
    public static final Integer SHOW_POST_ERR = 271;
    public static final Integer SHOW_POST_NULL = 272;

    public static final Integer INSERT_POST_OK = 200;
    public static final Integer INSERT_POST_ERR = 281;

    public static final Integer SHOW_WIKIPEDIA_OK = 200;
    public static final Integer SHOW_WIKIPEDIA_ERR = 291;

    public static final Integer LOAD_SCRIPT_OK = 300;
    public static final Integer LOAD_SCRIPT_ERR = 301;

    public static final Integer LOAD_SCRIPT_END_OK = 300;
    public static final Integer LOAD_SCRIPT_END_ERR = 311;

    public static final Integer COMMUNITY_LIKE_OK = 300;
    public static final Integer COMMUNITY_LIKE_ERR = 321;
    public static final Integer COMMUNITY_LIKE_CANCEL_OK = 322;

    public static final Integer COMMUNITY_LIKE_LIKED = 300;
    public static final Integer COMMUNITY_LIKE_NEVER = 321;

    public static final Integer COMMUNITY_STAR_OK = 300;
    public static final Integer COMMUNITY_STAR_ERR = 321;

    public static final Integer COMMUNITY_COMMENT_OK = 300;
    public static final Integer COMMUNITY_COMMENT_ERR = 331;

    public static final Integer COMMUNITY_COMMENT_LIKE_OK = 300;
    public static final Integer COMMUNITY_COMMENT_LIKE_ERR = 331;

    public static final Integer SHOW_POST_MAIN_OK = 300;
    public static final Integer SHOW_POST_MAIN_ERR = 341;

    public static final Integer SHOW_LIKE_POST_OK = 300;
    public static final Integer SHOW_LIKE_POST_ERR = 351;
    public static final Integer SHOW_LIKE_POST_NULL = 352;

    public static final Integer SHOW_MY_COMMENT_OK = 300;
    public static final Integer SHOW_MY_COMMENT_ERR = 361;
    public static final Integer SHOW_MY_COMMENT_NULL = 362;

    public static final Integer SHOW_MY_POST_OK = 300;
    public static final Integer SHOW_MY_POST_ERR = 371;
    public static final Integer SHOW_MY_POST_NULL = 372;

    public static final Integer SHOW_PLAYED_SCRIPT_OK = 380;
    public static final Integer SHOW_PLAYED_SCRIPT_ERR = 381;

    public static final Integer SHOW_VOTE_OK = 300;
    public static final Integer SHOW_VOTE_ERR = 391;

    public static final Integer VOTE_OK = 400;
    public static final Integer VOTE_ERR = 401;

    public static final Integer SHOW_VOTE_COMMENT_OK = 400;
    public static final Integer SHOW_VOTE_COMMENT_ERR = 411;

    public static final Integer INSERT_VOTE_FIRST_COMMENT_OK = 400;
    public static final Integer INSERT_VOTE_FIRST_COMMENT_ERR = 421;

    public static final Integer SHOW_REPOSITORY_OK = 400;
    public static final Integer SHOW_REPOSITORY_ERR = 431;

    public static final Integer FORK_REPOSITORY_OK = 400;
    public static final Integer FORK_REPOSITORY_ERR = 441;

    public static final Integer COMMIT_REPOSITORY_OK = 400;
    public static final Integer COMMIT_REPOSITORY_ERR = 451;

    public static final Integer SHOW_MY_VOTE_OK = 400;
    public static final Integer SHOW_MY_VOTE_ERR = 461;

    public static final Integer SCRIPT_SCORE_OK = 400;
    public static final Integer SCRIPT_SCORE_ERR = 471;
    public static final Integer SCRIPT_SCORE_SCORED = 472;

    public static final Integer SHARE_REPOSITORY_OK = 400;
    public static final Integer SHARE_REPOSITORY_ERR = 481;

    public static final Integer UPLOAD_NODE_POSITION_OK = 400;
    public static final Integer UPLOAD_NODE_POSITION_ERR = 491;

    public static final Integer SHOW_NODE_POSITION_OK = 500;
    public static final Integer SHOW_NODE_POSITION_ERR = 501;

    public static final Integer DEL_REPOSITORY_OK = 500;
    public static final Integer DEL_REPOSITORY_ERR = 511;

    public static final Integer DEL_NODE_OK = 500;
    public static final Integer DEL_NODE_ERR = 511;

    public static final Integer LOAD_REPOSITORY_ENDS_OK = 500;
    public static final Integer LOAD_REPOSITORY_ENDS_ERR = 541;

    public static final Integer LOAD_USER_OK = 500;
    public static final Integer LOAD_USER_ERR = 521;

    public static final Integer LOAD_USER_DAN_OK = 500;
    public static final Integer LOAD_USER_DAN_ERR = 531;

    public static final Integer DEL_REPOSITORY_SPECIAL_END_OK = 500;
    public static final Integer DEL_REPOSITORY_SPECIAL_END_ERR = 551;

    public static final Integer USER_COMMIT_SHOW_OK = 500;
    public static final Integer USER_COMMIT_SHOW_ERR = 561;

    public static final Integer UPDATE_SCRIPT_CLASSIFICATION_OK = 500;
    public static final Integer UPDATE_SCRIPT_CLASSIFICATION_ERR = 571;

    public static final Integer COMMIT_SCRIPT_OK = 900;
    public static final Integer COMMIT_SCRIPT_ERR = 909;

    public static final Integer COMMITTED_SHOW_OK = 900;
    public static final Integer COMMITTED_SHOW_ERR = 919;
}
