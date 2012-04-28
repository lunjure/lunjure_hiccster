#!/usr/bin/env ruby

require "rubygems"
require "sass/plugin"
require "find"

$default_base_dir = "static"

def get_template_locations(base_dir)
  result = {}
  Find.find(base_dir) do |path|
    if FileTest.directory?(path)
      if path.end_with?("css/sass")
        result[path] = path.chomp("/sass")
        Find.prune
      else
        next
      end
    end
  end  
  result
end

def compiler
  @compiler ||= Sass::Plugin::Compiler.new(:syntax => :scss).tap do |c|
    c.options[:template_location] = get_template_locations($default_base_dir)
    c.on_updated_stylesheet do |template, css|
      puts template
    end
    
    puts c.options[:template_location].keys
    puts
  end
end


case ARGV[0]
when 'watch'
  puts "Watching for changes in:"
  compiler.watch
when 'build'
  puts "Building stylesheets in:"
  compiler.update_stylesheets
else
  puts "usage: #{File.basename($0)} [ build | watch ]"
end
