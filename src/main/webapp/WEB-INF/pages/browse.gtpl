<% include '/WEB-INF/includes/header.gtpl' %>
<div class="row">
    <% def imageList = request.getAttribute('imageList') %>
    <% imageList.each { %>
    <div class="col-md-2 col-sm-3 col-xs-6">
        <div class="thumbnail">
            <div class="image" style="height: 162px; overflow-y: hidden; background-color: #F5F5F5;">
                <a href="${it.dataUrl}">
                    <img alt="" src="${it.imageUrl}" style="max-height: 200px;">
                </a>
            </div>
            <div class="row">
                <div class="col-md-6 col-xs-6 col-sm-6">
                    <img src="https://a248.e.akamai.net/assets.github.com/images/icons/emoji/moneybag.png" alt="Credits"
                         style="height: 16px; width: 16px;" data-toggle="tooltip" title="Credits"/>
                    ${it.credits}
                </div>
                <div class="col-md-6 col-xs-6 col-sm-6" style="text-align: right;">
                    ${it.impressions}
                    <img src="https://a248.e.akamai.net/assets.github.com/images/icons/emoji/octocat.png" alt="Impressions"
                         style="height: 16px; width: 16px;" data-toggle="tooltip" title="Impressions"/>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6 col-xs-6 col-sm-6">
                    <a href="${it.upvoteUrl}" data-toggle="tooltip" title="Upvote">
                        <img src="https://a248.e.akamai.net/assets.github.com/images/icons/emoji/+1.png" alt="Like"
                             style="height: 16px; width: 16px;"/>
                    </a>
                </div>
                <div class="col-md-6 col-xs-6 col-sm-6" style="text-align: right;">
                    <a href="${it.reportUrl}" data-toggle="tooltip" title="Report">
                        <img src="https://a248.e.akamai.net/assets.github.com/images/icons/emoji/-1.png" alt="Report"
                             style="height: 16px; width: 16px;"/>
                    </a>
                </div>
            </div>

        </div>
    </div>
    <% } %>
</div>
<% include '/WEB-INF/includes/footer.gtpl' %>
