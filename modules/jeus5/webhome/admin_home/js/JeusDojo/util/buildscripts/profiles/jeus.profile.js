dependencies = {
	layers: [
        {
			name: "dojo.js",
			dependencies: [
			]
		},
        {
			name: "jeus.js",
            layerDependencies: [
                		"dojo.js"
			],
            dependencies: [
                "dijit.layout.AccordionContainer",
                "dijit.layout.ContentPane",
                "dijit.layout.SplitContainer",
                "dijit.layout.LayoutContainer",
                "dijit.form.CheckBox",
                "dijit.form.FilteringSelect",
                "dijit.form.Textarea",
                "dijit.form.TextBox",
                "dijit.form.ValidationTextBox",
                "dijit.form.Button",
                "dijit.Tooltip",
                "dijit.Dialog",
                "dijit.TitlePane",
                "dijit.Tree",
                "dojox.widget.FisheyeList",
                "dojo.data.ItemFileReadStore",
                "dojo.widget.FloatingPane"
            ]
		}
	],

	prefixes: [
		[ "dijit", "../dijit" ],
        [ "dojox", "../dojox" ]
	]
}
