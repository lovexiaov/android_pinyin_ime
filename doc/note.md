
## 对照表

|术语                    |含义
|-----------------------|--------------------------------------------
|BalloonHint            |按下提示视图
|CandidatesContainer    |候选字（词）容器视图
|CandidateView          |单个候选字（词）视图
|ComposingView          |未选择的拼音串视图
|EnglishInputProcessor  |英文输入处理器
|Environment            |输入法环境配置（包括按键宽、高设置，提示窗口大小控制等）
|InputModSwitcher       |中英文输入法切换器
|KeyMapDream            |处理中文全角标点符号的类
|PinyinDecoderService   |与 JNI 交互，处理中文输入的核心服务
|PinyinIME              |输入法的主类，继承 InputMethodService
|Settings               |处理设置界面选项的类
|SettingsActivity       |设置界面
|SkbContainer           |顶级软键盘容器
|SkbPool                |用于缓存上一个软键盘布局的类
|SkbTemplate            |对应于 xml 中的 template 模板
|SoftKey                |对应于软键盘上的按键
|SoftKeyboard           |用于定义软键盘宽、高、背景图片，高亮图片等
|SoftKeyboardView       |用于显示软键盘
|SoftKeyToggle          |对应于软键盘上带开关状态的按键
|SoundManager           |按键音效管理器
|XmlKeyboardLoader      |加载 xml 按键布局的类，定义了 xml 文件中的属性与 java 代码和资源文件的对应关系


键盘的高度是通过 `Enveriment.KEY_HEIGHT_RATIO_PORTRAIT` 设置 Key 的高度确定的。